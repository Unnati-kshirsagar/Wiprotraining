package com.wipro.basics;

public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "Madam";
        String lower = input.toLowerCase();

        boolean isPalindrome = true;
        int len = lower.length();

        for (int i = 0; i < len / 2; i++) {
            if (lower.charAt(i) != lower.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
