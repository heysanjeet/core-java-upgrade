package org.learning.database;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpoyeeDemo {
    static void main() {
        List<Employee> allEmployees = EmployeeDB.getAllEmployees();

        allEmployees.stream().collect(Collectors.groupingBy(Employee::getEmpDept))
                .forEach((dept, emps) -> {
                    System.out.println("Department: " + dept);
                    emps.forEach(System.out::println);
                });
    }
}
