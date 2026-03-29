package org.learning;

import org.learning.database.Employee;
import org.learning.database.EmployeeDB;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListClient {
    static void main() {

        //top 3 employee from each depart
        List<Employee> empList = EmployeeDB.getAllEmployees();

        Map<String, List<Employee>> top3PerDept = empList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getEmpDept,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed())
                                        .limit(3)
                                        .collect(Collectors.toList())
                        )
                ));

        // Print results
        top3PerDept.forEach((dept, emps) -> {
            System.out.println("Department: " + dept);
            emps.forEach(System.out::println);
        });



        //2 Assuming Employee has getDepartment() and getSalary()
        Map<String, Double> totalSalaryByDept = empList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getEmpDept,
                        Collectors.summingDouble(Employee::getEmpSalary)
                ));

        // Print the results
        totalSalaryByDept.forEach((dept, total) ->
                System.out.println(dept + " : " + total));
    }
    }
