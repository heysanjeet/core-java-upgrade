package com.heysanjeet.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SimpleStream {
    public static void main(String[] args) {
        List<String> departmentList=new ArrayList<>();
        departmentList.add("IT");
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sells");
        departmentList.add("Marketing");

        Stream<String> deptStream =departmentList.stream();
        deptStream.forEach(System.out::println);

        Stream<String> nameList=Stream.of("Sanjeet","Sunil","Manish","Shivam");
        nameList.forEach(System.out::println);

        Stream<String> parallelStream=departmentList.parallelStream();
        parallelStream.forEach(System.out::println);

        Stream<String> emptyStream=Stream.empty();
        emptyStream.forEach(System.out::println);
    }
}
