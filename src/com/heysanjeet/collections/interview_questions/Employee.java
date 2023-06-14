package com.heysanjeet.collections.interview_questions;

import java.util.Objects;

public class Employee {
    private Integer empId;
    private String empName;
    private String empDept;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
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

    public Employee(Integer empId, String empName, String empDept) {
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDept='" + empDept + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(empId, employee.empId) && Objects.equals(empName, employee.empName) && Objects.equals(empDept, employee.empDept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, empDept);
    }
}
