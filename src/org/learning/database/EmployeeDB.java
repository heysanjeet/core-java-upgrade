package org.learning.database;

import java.util.List;

public class EmployeeDB {
    public static List<Employee> getAllEmployees() {
        return List.of(
                new Employee(1, "Alice", "HR", 70000.0),
                new Employee(2, "Bob", "HR", 75000.0),
                new Employee(3, "Charlie", "HR", 72000.0),
                new Employee(4, "David", "HR", 71000.0),
                new Employee(5, "Eve", "HR", 76000.0),
                new Employee(6, "Frank", "HR", 74000.0),

                new Employee(7, "Grace", "IT", 90000.0),
                new Employee(8, "Heidi", "IT", 85000.0),
                new Employee(9, "Ivan", "IT", 88000.0),
                new Employee(10, "Jack", "IT", 91000.0),
                new Employee(11, "Karen", "IT", 87000.0),
                new Employee(12, "Leo", "IT", 89000.0),

                new Employee(13, "Mona", "Finance", 80000.0),
                new Employee(14, "Nina", "Finance", 82000.0),
                new Employee(15, "Oscar", "Finance", 78000.0),
                new Employee(16, "Paul", "Finance", 83000.0),
                new Employee(17, "Quinn", "Finance", 79000.0),
                new Employee(18, "Rita", "Finance", 81000.0),

                new Employee(19, "Steve", "Marketing", 65000.0),
                new Employee(20, "Tina", "Marketing", 67000.0),
                new Employee(21, "Uma", "Marketing", 69000.0),
                new Employee(22, "Victor", "Marketing", 66000.0),
                new Employee(23, "Wendy", "Marketing", 68000.0),
                new Employee(24, "Xavier", "Marketing", 70000.0)
        );
    }
}
