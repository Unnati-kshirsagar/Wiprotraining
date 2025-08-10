package com.wipro.anonymous;

import java.util.function.Predicate;

public class CheckCase {
    public static void main(String[] args) {

        
        Predicate<String> isUpper = s -> s.equals(s.toUpperCase());

        Predicate<String> isLower = s -> s.equals(s.toLowerCase());

        String word1 = "JAVA";
        

        System.out.println("Is \"" + word1 + "\" uppercase? " + isUpper.test(word1));
        System.out.println("Is \"" + word1 + "\" lowercase? " + isLower.test(word1));
    }
}
