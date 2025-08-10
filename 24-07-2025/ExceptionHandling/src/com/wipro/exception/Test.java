package com.wipro.exception;

public class Test {
    public static void main(String[] args) {
        int month = 0; // Try with 0, 5, or -1

        try {
            checkMonth(month);
            System.out.println("Month is valid: " + month);
        } catch (InvalidMonthException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void checkMonth(int month) throws InvalidMonthException {
        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid month: " + month + ". Month must be between 1 and 12.");
        }
    }
}