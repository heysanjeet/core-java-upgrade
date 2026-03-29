package com.heysanjeet.java8.interview_questions;

public class Employee {
    private Integer empId;
    private String empName;
    private Double empSalary;
    private String empDepartment;
    private String empEmails;

    public Employee(Integer empId, String empName, Double empSalary, String empDepartment, String empEmails) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDepartment = empDepartment;
        this.empEmails = empEmails;
    }

    public Integer getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public String getEmpEmails() {
        return empEmails;
    }

    @Override
    public String toString() {
        return empId + " " + empName + " " + empSalary + " " + empDepartment + " " + empEmails;
    }
}
