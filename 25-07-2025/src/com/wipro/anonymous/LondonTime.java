package com.wipro.anonymous;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;
public class LondonTime {
    public static void main(String[] args) {
        Consumer<ZoneId> time = z -> System.out.println(LocalTime.now(z).format(DateTimeFormatter.ofPattern("hh:mm a")));
        time.accept(ZoneId.of("Europe/London"));
    }
}