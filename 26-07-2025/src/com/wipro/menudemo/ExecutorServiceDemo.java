package com.wipro.menudemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5); // 5 threads

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            Runnable task = () -> {
                for (int j = 1; j <= 10; j++) {
                    System.out.println("Task " + taskId + " - Number: " + j);
                    try {
                        Thread.sleep(1000); // 1-second delay
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            executor.submit(task);
        }

        executor.shutdown(); // Stop accepting new tasks
    }
}