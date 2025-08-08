package com.wipro.basics;

public class PalindromeWithStringBuilder {
    public static void main(String[] args) {
        String input = "Rotor";
        String lower = input.toLowerCase();

        StringBuilder sb = new StringBuilder(lower);
        String reversed = sb.reverse().toString();

        if (lower.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
