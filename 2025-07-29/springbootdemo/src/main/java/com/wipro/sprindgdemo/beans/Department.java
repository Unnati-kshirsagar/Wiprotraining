package com.wipro.sprindgdemo.beans;

public class Department {
    private String deptCode;
    private String departmentName;

    
    public Department(String deptCode, String departmentName) {
        this.deptCode = deptCode;
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department [deptCode=" + deptCode + ", departmentName=" + departmentName + "]";
    }
}
