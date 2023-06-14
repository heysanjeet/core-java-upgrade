package com.heysanjeet.collections.interview_questions;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSet {
    public static void main(String[] args) {
        Set<Employee> employeeSet=new HashSet<>();
        employeeSet.add(new Employee(1,"Sanjeet","IT"));
        employeeSet.add(new Employee(1,"Sanjeet","IT"));
        employeeSet.add(new Employee(2,"Sunil","HR"));
        employeeSet.add(new Employee(3,"Manish","IT"));
        employeeSet.add(new Employee(4,"Ruchikesh","IT"));
        employeeSet.add(new Employee(4,"Shivam","IT"));

        System.out.println(employeeSet);
        System.out.println(employeeSet.size());

    }
}
