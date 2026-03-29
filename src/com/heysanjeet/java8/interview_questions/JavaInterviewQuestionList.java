package com.heysanjeet.java8.interview_questions;

import org.learning.database.Employee;
import org.learning.database.EmployeeDB;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaInterviewQuestionList {
    public static void main() {
        List<Employee> allEmployees = EmployeeDB.getAllEmployees();

        /**
         * Given a list of employees, group them by department and return the top 3
         * highest-paid employees in each department.
         */

        Map<String, List<Employee>> empMap = allEmployees.stream().collect(Collectors.groupingBy(Employee::getEmpDept,
                Collectors.collectingAndThen(Collectors.toList(), list -> list.stream()
                        .sorted(Comparator.comparing(Employee::getEmpSalary).reversed()).limit(3)
                        .toList())));
        //empMap.forEach((key, value)-> System.out.println(key+" "+value));
        //System.out.println("--------------------------------------------------------------------");
        /**
         * Given a list of employees, find the employee with the highest salary.
         */
        Employee employee = allEmployees.stream().sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed())
                .findFirst().get();
        //System.out.println(employee);

        Employee maxEmp = allEmployees.stream().max(Comparator.comparingDouble(Employee::getEmpSalary)).get();
        //System.out.println(maxEmp);

        Employee empMaxSal = allEmployees.stream().collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getEmpSalary)), Optional::get));
        //System.out.println(empMaxSal);

        System.out.println("----------------------------------------------------------");
        /**
         * Given a list of employees, group them by department and count how many employees fall within the
         * top 3 highest salaries in each department.
         */
        Map<String, Long> empCountMap = allEmployees.stream().collect(Collectors.groupingBy(Employee::getEmpDept, Collectors.collectingAndThen(
                Collectors.toList(), list -> list.stream().sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed()).limit(3).count()
        )));
        //empCountMap.forEach((key, value)-> System.out.println(key+" "+value));

        /**
         * Given a list of employees, calculate the total salary expense for each department.
         */
        Map<String, Double> deptAndSal = allEmployees.stream().collect(Collectors.groupingBy(Employee::getEmpDept,Collectors.summingDouble(Employee::getEmpSalary)
        ));
        //deptAndSal.forEach((dept, sal)-> System.out.println(dept+" "+sal));

        //System.out.println("-------------------------------------------------");
        /**
         * Given a list of employees where duplicate employee IDs may exist, return a map of employeeId to the employee
         * having the highest salary for that ID.
         */
        //Naive solution
        //Tc-O(nlogn)
        Map<Integer, Employee> empMaxSalary = allEmployees.stream().collect(Collectors.groupingBy(Employee::getEmpId,
                Collectors.collectingAndThen(Collectors.toList(), list2 -> list2.stream()
                        .sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed()).findFirst().get())));
        //Best solution
        //TC-O(n)
        Map<Integer, Employee> empMaxSalaryBest = allEmployees.stream().collect(Collectors.groupingBy(Employee::getEmpId,
                Collectors.collectingAndThen(Collectors.toList(), list2 -> list2.stream().max(Comparator.comparingDouble(Employee::getEmpSalary)).get())));
        //empMaxSalaryBest.forEach((key, val)-> System.out.println(key+" "+val));

        System.out.println("-------------------------------------------------------------------");

        /**
         * Given a list of employees where duplicate employee IDs may exist, convert it into a map of employeeId to Employee,
         * keeping the employee with the highest salary when duplicates occur.
         * Note: This is better than the previous approach as it uses toMap collector which is more efficient than groupingBy
         * and then sorting the list. It also handles the duplicate keys by providing a merge function that compares
         * the salaries and keeps the employee with the highest salary.
         */

        Map<Integer, Employee> employeeMap = allEmployees.stream().collect(Collectors.toMap(Employee::getEmpId,
                e -> e,// value mapper:otherwise it will fail with duplicate key exception
                (e1, e2) -> e1.getEmpSalary() > e2.getEmpSalary() ? e1 : e2));
        //employeeMap.forEach((key, val)-> System.out.println(key+" "+val.getEmpSalary()));

        /**
         * Given a list of employees, sort them by salary in descending order, and if salaries
         */
        List<Employee> list = allEmployees.stream().sorted(Comparator.comparingDouble
                (Employee::getEmpSalary).reversed().thenComparing(
                employee1 -> employee1.getEmpName().toLowerCase()
        )).toList();
        list.forEach(System.out::println);
    }
}
