package com.wipro.basics;

public class ShapeIdentifier {
    public static void main(String[] args) {
        // Example value (change this to test other values)
        char shape = 'R';

        // Convert to uppercase to handle lowercase inputs like 'r', 'c', 's'
        shape = Character.toUpperCase(shape);

        if (shape == 'R') {
            System.out.println("Rectangle");
        } else if (shape == 'C') {
            System.out.println("Circle");
        } else if (shape == 'S') {
            System.out.println("Square");
        } else {
            System.out.println("Other");
        }
    }
}
