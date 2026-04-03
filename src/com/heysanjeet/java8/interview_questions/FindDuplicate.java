package com.heysanjeet.java8.interview_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {
    /**
     * Given a string, return a list of all characters that
     * appear more than once.
     *
     */
    public static void main(String[] args) {
        String str = "HelloSanjeet";
        List<String> list = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(chars -> chars.getValue() > 1)
                .map(Map.Entry::getKey).toList();
        System.out.println(list);
    }
}
