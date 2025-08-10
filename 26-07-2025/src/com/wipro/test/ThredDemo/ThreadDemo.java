package com.wipro.test.ThredDemo;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        t1.start(); 

        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + i);
        }
    }
}