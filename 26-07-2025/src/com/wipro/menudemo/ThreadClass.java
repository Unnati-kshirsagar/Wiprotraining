package com.wipro.menudemo;

public class ThreadClass extends Thread {
    Counter counter;

    public ThreadClass(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) { 
            counter.increment();
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
