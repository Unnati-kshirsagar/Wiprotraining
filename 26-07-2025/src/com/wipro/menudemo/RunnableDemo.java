package com.wipro.menudemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        List<String> names = new ArrayList<>(Arrays.asList("Amit", "Jayanta"));

        Thread t1 = new Thread(VowelTask.getTask(names));     
        Thread t2 = new Thread(NonVowelTask.getTask(names));  
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final List: " + names);
    }
}
