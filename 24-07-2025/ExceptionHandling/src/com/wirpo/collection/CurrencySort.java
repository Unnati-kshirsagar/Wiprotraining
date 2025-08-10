package com.wirpo.collection;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class CurrencySort {
    public static void main(String[] args) {
        // One simple map using java.util.Map
        Map<String, String> currencyMap = Map.of(
            "USD", "United States Dollar",
            "INR", "Indian Rupee",
            "EUR", "Euro",
            "JPY", "Japanese Yen",
            "GBP", "British Pound"
        );

        // Print header
        System.out.println("Currencies sorted by name:\n");

        // Sort and print manually using a simple loop
        for (String code : currencyMap.keySet().stream()
                .sorted((c1, c2) -> currencyMap.get(c1).compareTo(currencyMap.get(c2)))
                .toList()) {

            System.out.println(code + " - " + currencyMap.get(code));
        }
    }
}
