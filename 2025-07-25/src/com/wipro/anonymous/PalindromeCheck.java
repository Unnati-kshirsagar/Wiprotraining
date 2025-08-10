package com.wipro.anonymous;

import java.util.function.Predicate;

public class PalindromeCheck {

    public static void main(String[] args) {


        Predicate<String> isPalindrome = text -> {
            
           

            return text.equalsIgnoreCase(new StringBuilder(text).reverse().toString());
        };


        String word1 = "noon";
        String word2 = "hello";

      
        System.out.println("Is \"" + word1 + "\" a palindrome? " + isPalindrome.test(word1));
        System.out.println("Is \"" + word2 + "\" a palindrome? " + isPalindrome.test(word2));
    }
}
