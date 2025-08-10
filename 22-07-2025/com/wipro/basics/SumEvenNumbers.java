package com.wipro.basics;

public class SumEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of all even numbers between 1 and 100 is: " + sum);
    }
}
