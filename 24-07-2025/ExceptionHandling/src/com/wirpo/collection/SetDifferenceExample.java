package com.wirpo.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDifferenceExample {
    public static void main(String[] args) {
        // 1st set
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        // 2nd set
        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        // difference
        Set<Integer> difference = new HashSet<>(set1); // copy of set1
        difference.removeAll(set2); // remove elements that are also in set2
        
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Difference Set1 - Set2: " + difference);
    }
}
