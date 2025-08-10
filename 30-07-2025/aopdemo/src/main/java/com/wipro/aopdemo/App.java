package com.wipro.aopdemo;

import com.wipro.aopdemo.service.AirTravelProcess;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.aopdemo.config.AppConfig;
import com.wipro.aopdemo.exception.NoSeatAvailableException;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AirTravelProcess travel = context.getBean(AirTravelProcess.class);

        try {
            travel.checkIn(true); // Set to true for successful check-in
            travel.collectBoardingPass();
            travel.doSecurityCheck();
            travel.doBoarding();
        } catch (NoSeatAvailableException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }

        context.close();
    }
}
