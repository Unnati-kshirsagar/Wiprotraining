package com.wipro.menudemo;

public class ThreadDemo2 {
    public static void main(String[] args) {
        NumberThread num = new NumberThread();
        AlphabetThread alpha = new AlphabetThread();

        num.start();    
        alpha.start();  
    }
}