package com.wipro.basics;

public class ShortestWordFind {
    public static void main(String[] args) {
        String sentence = "An anagram is a word or phrase formed by rearranging the letters of a different word or phrase.";

        // Split by spaces (and punctuation)
        String[] words = sentence.split("[\\s.,]+");

        String shortest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }

        System.out.println("Shortest word: " + shortest);
    }
}
