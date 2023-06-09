package com.heysanjeet.java8.interview_questions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        String str = "iloveyou";
        Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(chars -> chars.getValue() > 1)
                .map(Map.Entry::getKey).forEach(System.out::println);
    }
}
