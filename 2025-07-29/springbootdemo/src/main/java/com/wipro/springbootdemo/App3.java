package com.wipro.springbootdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.wipro.sprindgdemo.beans.Mobile;

public class App3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.wipro.sprindgdemo.beans");
        Mobile mobile = context.getBean(Mobile.class);
        System.out.println(mobile);
        context.close();
    }
}
