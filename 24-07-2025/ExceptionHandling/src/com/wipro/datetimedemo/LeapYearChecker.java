package com.wipro.datetimedemo;

import java.time.LocalDate;

public class LeapYearChecker {

    public static void main(String[] args) {
        
        int year = 2024; 

        
        LocalDate date = LocalDate.of(year, 1, 1);

        
        if (date.isLeapYear()) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
