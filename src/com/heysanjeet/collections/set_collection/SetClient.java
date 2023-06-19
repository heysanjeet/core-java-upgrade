package com.heysanjeet.collections.set_collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SetClient {
    public static void main(String[] args) {

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee("Sanjeet", "Patna", "SDE"));
        employeeSet.add(new Employee("Sanjeet", "Patna", "SDE"));
        employeeSet.add(new Employee("Sunil", "Bangalore", "SDE"));
        employeeSet.add(new Employee("Manish", "Pune", "SDE"));
        employeeSet.add(new Employee("Shivam", "Delhi", "SDE"));

        //employeeSet.forEach(System.out::println);


        String str="SanjeetKumar";

        Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }
}
