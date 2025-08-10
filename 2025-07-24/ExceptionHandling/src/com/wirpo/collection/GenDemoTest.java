package com.wirpo.collection;

public class GenDemoTest {
    public static void main(String[] args) {
        // Integer type
        GenDemo<Integer> intDemo = new GenDemo<>(123);
        System.out.println("Integer Value: " + intDemo.getData());

        // String type
        GenDemo<String> strDemo = new GenDemo<>("Unnati");
        System.out.println("String Value: " + strDemo.getData());

        // Double type
        GenDemo<Double> doubleDemo = new GenDemo<>(99.99);
        System.out.println("Double Value: " + doubleDemo.getData());
    }
}
