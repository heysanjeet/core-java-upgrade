package com.heysanjeet.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        String[] cityArray = {"Bangalore", "Pune", "Delhi", "Mumbai"};
        List<String> collect = Arrays.stream(cityArray).map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
