package com.wirpo.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateExample {
    public static void main(String[] args) {

        // Creating a list with duplicate names
        List<String> nameList = new ArrayList<>();
        nameList.add("UNNATI");
        nameList.add("UTKARSH");
        nameList.add("UNNATI");
        nameList.add("SANJAY");
        nameList.add("UTKARSH");

        System.out.println("Original List: " + nameList);

        // Using Set to remove duplicates
        Set<String> uniqueSet = new HashSet<>(nameList);

        // Converting Set back to List
        List<String> finalList = new ArrayList<>(uniqueSet);

        System.out.println("List after removing duplicates: " + finalList);
    }
}
