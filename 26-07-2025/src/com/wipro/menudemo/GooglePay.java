package com.wipro.menudemo;

public class GooglePay implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using GooglePay.");
    }
}