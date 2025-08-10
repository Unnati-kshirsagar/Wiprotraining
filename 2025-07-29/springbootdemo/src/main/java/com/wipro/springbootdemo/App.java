package com.wipro.springbootdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.wipro.sprindgdemo.beans.Department;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Department dept = (Department) context.getBean("department");

        System.out.println(dept);
    }
}
