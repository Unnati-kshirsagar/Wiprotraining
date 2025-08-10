package com.wipro.menudemo;

public class Paytm implements PaymentProcessor {
	public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Paytm.");
    }
}


	 