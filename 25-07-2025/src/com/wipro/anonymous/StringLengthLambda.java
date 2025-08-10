package com.wipro.anonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class StringLengthLambda {
    public static void main(String[] args) {
        Function<List<String>, List<Integer>> getLengths = list -> {
            List<Integer> len = new ArrayList<>();
            for (String s : list) len.add(s.length());
            return len;
        };

        System.out.println(getLengths.apply(Arrays.asList("Jayanta", "Amit", "Vasu")));
    }
}