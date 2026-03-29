package org.learning.database;

public class Employee {
    private Integer empId;
    private String empName;
    private String empDept;
    private Double empSalary;
    private String empEmail;

    public Employee(Integer empId, String empName, String empDept, Double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
        this.empSalary = empSalary;
        this.empEmail = empName.toLowerCase() + "@company.com";
    }

    public Integer getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDept='" + empDept + '\'' +
                ", empSalary=" + empSalary +
                ", empEmail='" + empEmail + '\'' +
                '}';
    }
}
