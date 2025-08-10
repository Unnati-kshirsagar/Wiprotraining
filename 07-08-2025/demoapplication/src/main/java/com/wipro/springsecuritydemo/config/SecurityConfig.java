package com.wipro.springsecuritydemo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    // Set up in-memory user
    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user = User.builder()
            .username("unnati")
            .password(passwordEncoder().encode("password123"))
            .roles("USER")
            .build();
        return new InMemoryUserDetailsManager(user);
    }

    // Password encoder
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Security configuration
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/hello").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(Customizer.withDefaults())    // Enable login form
            .logout(logout -> logout
                .logoutUrl("/logout")                // Default logout URL
                .logoutSuccessUrl("/hello")          // Redirect here after logout
                .invalidateHttpSession(true)
                .clearAuthentication(true)
            );

        return http.build();
    }
}