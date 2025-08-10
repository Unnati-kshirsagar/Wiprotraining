package com.wipro.anonymous;


import java.util.function.Function;

public class FractionPartExample {

	public static void main(String[] args) {

        // Lambda to extract and print only .675 format
        Function<Double, String> getFraction =
            num -> {
                double frac = num - Math.floor(num);           // e.g., 0.675
                String str = String.valueOf(frac);             // "0.675"
                return str.startsWith("0") ? str.substring(1) : str; // ".675"
            };

        // Example usage
        System.out.println(getFraction.apply(99.675));   // Output: .675
    }
}