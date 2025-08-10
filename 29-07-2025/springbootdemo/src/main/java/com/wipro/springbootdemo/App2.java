package com.wipro.springbootdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.sprindgdemo.beans.College;



public class App2 {
	public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans2.xml");

        College college = (College) ctx.getBean("college");
        System.out.println(college);
    }

	
}
	