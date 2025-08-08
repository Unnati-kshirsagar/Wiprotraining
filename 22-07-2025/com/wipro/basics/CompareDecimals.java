package com.wipro.basics;

import java.util.Scanner;

public class CompareDecimals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        System.out.print("Input floating-point number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Input floating-point another number: ");
        double num2 = scanner.nextDouble();

        // Round both to 3 decimal places by scaling and rounding
        long n1 = Math.round(num1 * 1000);
        long n2 = Math.round(num2 * 1000);

        // Compare the rounded values
        if (n1 == n2) {
            System.out.println("They are the same up to three decimal places.");
        } else {
            System.out.println("They are different.");
        }

        scanner.close();
    }
}
