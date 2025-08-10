package com.wipro.anonymous;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.function.Supplier;

public class TomorrowDay {
    public static void main(String[] args) {
        Supplier<String> tomorrow = () -> LocalDate.now().plusDays(1).getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
        System.out.println("Tomorrow is: " + tomorrow.get());
    }
}
