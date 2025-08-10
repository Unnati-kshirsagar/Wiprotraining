package com.wipro.menudemo;

class EvenThread extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}