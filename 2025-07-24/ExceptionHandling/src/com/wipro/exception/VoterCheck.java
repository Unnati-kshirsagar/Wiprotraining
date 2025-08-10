package com.wipro.exception;

public class VoterCheck {
    public static void main(String[] args) {
        int age = 16; // Change this to 20 and test again

        try {
            checkVoterEligibility(age);
            System.out.println("You are eligible to vote.");
        } catch (VoterInvalidException e) {
            System.out.println("Voter check failed: " + e.getMessage());
        }
    }

    public static void checkVoterEligibility(int age) throws VoterInvalidException {
        if (age < 18) {
            throw new VoterInvalidException("Age is less than 18. Not eligible to vote.");
        }
    }
}
