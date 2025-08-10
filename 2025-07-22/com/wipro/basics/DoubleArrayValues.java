package com.wipro.basics;

public class DoubleArrayValues {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 4}; // initialized with some random numbers

        // Modify each value to be twice the old value
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }

        // Print the new values
        System.out.println("Doubled values:");
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
