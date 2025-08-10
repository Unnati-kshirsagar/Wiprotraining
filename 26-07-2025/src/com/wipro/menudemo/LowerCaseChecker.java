package com.wipro.menudemo;

public class LowerCaseChecker {

    public boolean isAllLowerCase(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c) && !Character.isLowerCase(c)) {
                return false;
            }
        }

        return true;
    }
}