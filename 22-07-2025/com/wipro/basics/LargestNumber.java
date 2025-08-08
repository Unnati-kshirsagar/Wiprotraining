package com.wipro.basics;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {100, 67, 98, 678, 45, 123};

        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest number is: " + max);
    }
}
