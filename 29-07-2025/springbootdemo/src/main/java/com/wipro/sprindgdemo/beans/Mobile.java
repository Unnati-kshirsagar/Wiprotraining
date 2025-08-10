package com.wipro.sprindgdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

    private final Display display;

    @Autowired
    public Mobile(Display display) {
        this.display = display;
    }

    public Display getDisplay() {
        return display;
    }

    @Override
    public String toString() {
        return "Mobile with " + display;
    }
}
