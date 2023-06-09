package com.heysanjeet.java8.interview_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindUnique {
    public static void main(String[] args) {
        String str = "iloveyou";
        List<String> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(chars -> chars.getValue() == 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect);

    }
}
