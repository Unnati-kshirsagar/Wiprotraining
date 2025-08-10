package com.wipro.anonymous;

public class LambdaDemo {
    public static void main(String[] args) {
        // Lambda expression
        Greet greet = () -> System.out.println("Hello Lambda");

        // Call method
        greet.sayHello();
    }
}