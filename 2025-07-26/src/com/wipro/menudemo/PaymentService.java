package com.wipro.menudemo;

public class PaymentService {
    private PaymentProcessor app;

    public PaymentService(PaymentProcessor app) {
        this.app = app;
    }

    public void makePayment(double amount) {
        app.pay(amount);
    }
}
