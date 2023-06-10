package com.heysanjeet.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparable implements Comparable<EmployeeComparable> {
    private Integer empId;
    private String empName;
    private String empLocation;

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

    public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    @Override
    public String toString() {
        return "EmployeeComparable{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empLocation='" + empLocation + '\'' +
                '}';
    }

    public EmployeeComparable(Integer emmid, String empName, String empLocation) {
        this.empId = emmid;
        this.empName = empName;
        this.empLocation = empLocation;
    }

    @Override
    public int compareTo(EmployeeComparable o) {
        return this.empId - o.empId;//this will work because of empId is positive integer
    }

    public static void main(String[] args) {
        List<EmployeeComparable> employeeList = new ArrayList<>();
        employeeList.add(new EmployeeComparable(2, "Sanjeet", "Bangalore"));
        employeeList.add(new EmployeeComparable(4, "Sunil", "Bangalore"));
        employeeList.add(new EmployeeComparable(3, "Manish", "Bangalore"));
        employeeList.add(new EmployeeComparable(1, "Ruchi", "Bangalore"));

        Collections.sort(employeeList);
        System.out.println(employeeList);


    }
}
