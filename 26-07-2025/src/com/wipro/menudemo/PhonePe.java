package com.wipro.menudemo;

public class PhonePe implements PaymentProcessor {
	public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PhonePe.");
    }
}