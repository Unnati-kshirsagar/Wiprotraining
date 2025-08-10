package com.wipro.anonymous;

import java.util.Arrays;
import java.util.List;

public class CalculateAverage {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);

        int avg = (int) nums.stream().mapToInt(n -> n).average().orElse(0);
        System.out.println(avg);
    }
}