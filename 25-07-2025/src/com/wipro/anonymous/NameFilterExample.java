package com.wipro.anonymous;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NameFilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jayanta", "Jnanendra");

        Function<List<String>, List<String>> findJA = list ->
            list.stream()
                .filter(n -> n.toLowerCase().contains("ja"))
                .collect(Collectors.toList());

        System.out.println(findJA.apply(names));  
    }
}	