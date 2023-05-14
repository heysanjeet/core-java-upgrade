package com.heysanjeet.collections.set_collection;

import java.util.Objects;

public class Employee {
    private String name;
    private String location;
    private String designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String location, String designation) {
        this.name = name;
        this.location = location;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) && location.equals(employee.location) && designation.equals(employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, designation);
    }
}

