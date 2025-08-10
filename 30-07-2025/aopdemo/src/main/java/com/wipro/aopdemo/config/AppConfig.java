package com.wipro.aopdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.wipro.aopdemo")
@EnableAspectJAutoProxy
public class AppConfig {
}
