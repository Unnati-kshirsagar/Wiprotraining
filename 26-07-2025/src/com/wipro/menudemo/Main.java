package com.wipro.menudemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount to pay:");
        double amount = sc.nextDouble();

        System.out.println("Choose payment method:");
        System.out.println("1. PhonePe");
        System.out.println("2. GooglePay");
        System.out.println("3. Paytm");

        int choice = sc.nextInt();
        PaymentProcessor app;

        switch (choice) {
            case 1:
                app = new PhonePe();
                break;
            case 2:
                app = new GooglePay();
                break;
            case 3:
                app = new Paytm();
                break;
            default:
                System.out.println("Invalid choice.");
                sc.close();
                return;
        }

        PaymentService service = new PaymentService(app);
        service.makePayment(amount);

        sc.close();
    }
}