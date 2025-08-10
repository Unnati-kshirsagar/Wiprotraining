package com.wipro.aopdemo.service;

import com.wipro.aopdemo.exception.NoSeatAvailableException;
import org.springframework.stereotype.Service;

@Service
public class AirTravelProcess {

    public void checkIn(Boolean flag) throws NoSeatAvailableException {
        if (flag) {
            System.out.println("check in successful");
        } else {
            throw new NoSeatAvailableException("No seats available");
        }
    }

    public void collectBoardingPass() {
        System.out.println("collect boarding pass");
    }

    public void doSecurityCheck() {
        System.out.println("do security check");
    }

    public void doBoarding() {
        System.out.println("do boarding");
    }
}
