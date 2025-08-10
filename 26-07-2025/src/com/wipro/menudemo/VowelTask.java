package com.wipro.menudemo;

import java.util.List;

public class VowelTask {
    public static Runnable getTask(List<String> names) {
        return () -> {
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);
                String first = name.substring(0, 1).toLowerCase();

                if (first.equals("a") || first.equals("e") || first.equals("i") || first.equals("o") || first.equals("u")) {
                    names.set(i, name.toUpperCase());
                }
            }
        };
    }
}