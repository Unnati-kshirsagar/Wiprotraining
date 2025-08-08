package com.wipro.basics;

import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a number: ");
        double number = scanner.nextDouble();

        System.out.print("Input value: " + number + "\n");

        if (number == 0) {
            System.out.println("Zero");
        } else {
            // Check sign
            if (number > 0) {
                System.out.print("Positive");
            } else {
                System.out.print("Negative");
            }

            // Check size
            double absValue = Math.abs(number);
            if (absValue < 1) {
                System.out.print(" and small");
            } else if (absValue > 1_000_000) {
                System.out.print(" and large");
            }

            System.out.println();  // move to next line
        }

        scanner.close();
    }
}
