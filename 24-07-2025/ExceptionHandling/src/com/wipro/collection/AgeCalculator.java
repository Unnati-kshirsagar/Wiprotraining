package com.wipro.collection;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

    public static int getAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        
        if (birthDate != null && birthDate.isBefore(currentDate)) {
            Period period = Period.between(birthDate, currentDate);
            return period.getYears();
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2001, 4, 28); // 
        int age = getAge(birthDate);
        System.out.println("Age: " + age + " years");
    }
}
