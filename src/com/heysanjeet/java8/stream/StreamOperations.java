package com.heysanjeet.java8.stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {
        //flatMapOperation();
        //filterOperation();
        anyMatchOperation();

    }

    public static void mapOperation() {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("IT");
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Marketing");
        departmentList.stream().map(name -> name.toLowerCase()).forEach(System.out::println);

    }

    public static void flatMapOperation() {
        String[] arrayString = {"Bangalore", "Chennai"};
        Stream<String> capList = Stream.of(arrayString);
        capList.map(cap -> cap.split("")).flatMap(Arrays::stream).forEach(System.out::println);

    }

    public static void filterOperation() {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("IT");
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Marketing");

        Stream<String> deptList = departmentList.stream();
        deptList.filter(dept -> dept.startsWith("M")).map(dep -> dep.toLowerCase()).forEach(System.out::println);
    }

    public static void anyMatchOperation(){
        List<String> departmentList = new ArrayList<>();
        departmentList.add("IT");
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Marketing");

        boolean isTrue=departmentList.stream().anyMatch(dept->dept.contains("IT"));
        System.out.println(isTrue);
    }

}
