package com.wipro.anonymous;

import java.util.List;
import java.util.Arrays;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + " - " + name + " - ₹" + salary;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(101, "Jayanta", 50000),
            new Employee(102, "Amit", 45000),
            new Employee(103, "Vasu", 55000)
        );

        
        employees.sort((e1, e2) -> e1.name.compareToIgnoreCase(e2.name));

        
       System.out.println(employees);
    }
}
