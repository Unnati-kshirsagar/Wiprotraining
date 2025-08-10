package com.wipro.aopdemo.aspect;

import com.wipro.aopdemo.exception.NoSeatAvailableException;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AirTravelAspect {

    @Before("execution(* com.wipro.aopdemo.service.AirTravelProcess.checkIn(..))")
    public void showPhotoId() {
        System.out.println("show photo id");
    }

    @Before("execution(* com.wipro.aopdemo.service.AirTravelProcess.doSecurityCheck(..)) || execution(* com.wipro.aopdemo.service.AirTravelProcess.doBoarding(..))")
    public void showBoardingPass() {
        System.out.println("show boarding pass" );
    }

    @AfterThrowing(pointcut = "execution(* com.wipro.aopdemo.service.AirTravelProcess.checkIn(..))", throwing = "ex")
    public void handleNoSeatException(NoSeatAvailableException ex) {
        System.out.println("Please,contact your airline manager " + ex.getMessage());
    }
}
