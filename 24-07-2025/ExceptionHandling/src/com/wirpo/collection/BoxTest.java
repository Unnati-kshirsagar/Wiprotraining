package com.wirpo.collection;

public class BoxTest {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        System.out.println(intBox.get());
        
        Box<String> strBox=new Box<>();
        strBox.set("Unnati");
        System.out.println( strBox.get());
    }
}
