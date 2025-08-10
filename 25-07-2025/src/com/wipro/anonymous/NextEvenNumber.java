package com.wipro.anonymous;

import java.util.function.Consumer;

public class NextEvenNumber {
    public static void main(String[] args) {

       
        Consumer<Integer> printNextEven = num -> {
            if (num % 2 == 0)
                System.out.println(num + 2);  
                System.out.println(num + 1); 
        };

        
        printNextEven.accept(5);    
         
    }
}
