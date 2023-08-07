package com.heysanjeet.interview_questions;

import java.util.ArrayList;
import java.util.List;

public class RemoveItemFromList {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Sanjeet","20000"));
        employeeList.add(new Employee(2,"Sunil","20000"));
        employeeList.add(new Employee(3,"Anil","20000"));
        employeeList.add(new Employee(5,"Tiwari","20000"));
        employeeList.add(new Employee(7,"Shivam","20000"));
        employeeList.add(new Employee(4,"Ruchikesh","20000"));

        employeeList.remove(4);
        employeeList.remove(2);
        employeeList.forEach(System.out::println);
    }
}
