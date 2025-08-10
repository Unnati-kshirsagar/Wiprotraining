package com.wirpo.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> airportCode = new HashMap<>();
        
        airportCode.put("CCU", "Kolkata");
        airportCode.put("BOM", "Mumbai");
        airportCode.put("DEL", "Delhi");

        System.out.println("City for BOM: " + airportCode.get("BOM"));               // Mumbai
        System.out.println("Contains key BOM1? " + airportCode.containsKey("BOM1")); // false

        System.out.println("All airport codes and cities:");
        for (Map.Entry<String, String> data : airportCode.entrySet()) {
            System.out.println("Code: " + data.getKey() + ", City: " + data.getValue());
        }
    }
}
