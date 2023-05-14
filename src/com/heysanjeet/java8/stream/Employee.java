package com.heysanjeet.java8.stream;

public class Employee {
    private String empName;
    private String empDept;
    private String empLocation;
    private int empSalary;

    public Employee(String empName, String empDept, String empLocation, int empSalary) {
        this.empName = empName;
        this.empDept = empDept;
        this.empLocation = empLocation;
        this.empSalary = empSalary;
    }

    public Employee() {

    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }
}
