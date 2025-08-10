package com.wirpo.collection;
import java.util.concurrent.CopyOnWriteArrayList;

class Employee {
    String empId;
    String empName;
    int empAge;
    double empSalary;

    // Constructor
    public Employee(String empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    // To display employee details
    public String toString() {
        return empId + " - " + empName + " - Age: " + empAge + " - Salary: " + empSalary;
    }
}

public class RemoveEmployee {
    public static void main(String[] args) {

        // Create a CopyOnWriteArrayList to store employees
        CopyOnWriteArrayList<Employee> empList = new CopyOnWriteArrayList<>();

        // Add some employees
        empList.add(new Employee("E101", "Amit", 26, 75000));
        empList.add(new Employee("E102", "Neha", 30, 85000));
        empList.add(new Employee("E103", "Raj", 28, 90000));
        empList.add(new Employee("E104", "Sneha", 24, 70000));

        // Print before removal
        System.out.println("Before removal:");
        for (Employee e : empList) {
            System.out.println(e);
        }

        // Remove employees with salary > 80000
        for (Employee e : empList) {
            if (e.empSalary > 80000) {
                empList.remove(e);
            }
        }

        // Print after removal
        System.out.println("\nAfter removal:");
        for (Employee e : empList) {
            System.out.println(e);
        }
    }
}
