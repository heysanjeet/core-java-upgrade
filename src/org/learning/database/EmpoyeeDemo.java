package org.learning.database;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpoyeeDemo {
    static void main() {
        List<Employee> allEmployees = EmployeeDB.getAllEmployees();

        Map<String, List<Employee>> collect = allEmployees.stream().collect(Collectors.groupingBy(Employee::getEmpDept));
        collect.forEach((key,value)->{
            System.out.println(key+" "+value);
        });
    }
}
