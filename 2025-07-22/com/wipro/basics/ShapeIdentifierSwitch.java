package com.wipro.basics;

public class ShapeIdentifierSwitch {
    public static void main(String[] args) {
        // Example input value (you can change it to test)
        char shape = 'R';

        // Convert to uppercase to handle lowercase letters
        shape = Character.toUpperCase(shape);

        switch (shape) {
            case 'R':
                System.out.println("Rectangle");
                break;
            case 'C':
                System.out.println("Circle");
                break;
            case 'S':
                System.out.println("Square");
                break;
            default:
                System.out.println("Other");
        }
    }
}
