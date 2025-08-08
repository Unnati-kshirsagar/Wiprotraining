package com.wipro.basics;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

        if (arr.length == 0) {
            System.out.println("Length after removing duplicates: 0");
            return;
        }

        int j = 0; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        int lengthWithoutDuplicates = j + 1;

        System.out.println("Length after removing duplicates: " + lengthWithoutDuplicates);
        System.out.print("Resulting array: ");
        for (int i = 0; i < lengthWithoutDuplicates; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
