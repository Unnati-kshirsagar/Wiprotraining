package com.wipro.datetimedemo;

import java.time.LocalDate;
import java.time.Period;

public class DateDifferenceCalculator {

    public static void getDateDiff(LocalDate dt1, LocalDate dt2) {
     
        if (dt1.isAfter(dt2)) {
            LocalDate temp = dt1;
            dt1 = dt2;
            dt2 = temp;
        }

        Period diff = Period.between(dt1, dt2);

        System.out.println("Difference is: " 
            + diff.getYears() + " years, "
            + diff.getMonths() + " months, "
            + diff.getDays() + " days");
    }

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 11, 12);
        LocalDate date2 = LocalDate.of(2024, 01, 10);

        getDateDiff(date1, date2);  // call your method here
    }
}
