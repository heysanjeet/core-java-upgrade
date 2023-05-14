package com.heysanjeet.collections.set_collection;

import java.util.HashSet;
import java.util.Set;

public class SetClient {
    public static void main(String[] args) {

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee("Sanjeet", "Patna", "SDE"));
        employeeSet.add(new Employee("Sanjeet", "Patna", "SDE"));
        employeeSet.add(new Employee("Sunil", "Bangalore", "SDE"));
        employeeSet.add(new Employee("Manish", "Pune", "SDE"));
        employeeSet.add(new Employee("Shivam", "Delhi", "SDE"));

        employeeSet.forEach(System.out::println);

    }
}
