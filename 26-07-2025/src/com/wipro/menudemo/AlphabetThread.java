package com.wipro.menudemo;

public class AlphabetThread extends Thread {
    public void run() {
        for (char i = 'A'; i <= 'J'; i++) {
            System.out.println("Alphabet: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}