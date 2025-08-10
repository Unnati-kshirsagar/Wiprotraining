package com.wipro.menudemo;

public class CounterDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();

        ThreadClass t1 = new ThreadClass(counter);
        ThreadClass t2 = new ThreadClass(counter);

        t1.start();
        t2.start();

        try {
            t1.join();  
            t2.join();  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
