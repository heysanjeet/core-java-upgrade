package com.heysanjeet.java8.interview_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindUnique {
    public static void main(String[] args) {

        /**
         * Find all non-repeating characters in a given string.
         */
        String str = "SanjeetKumar";
        List<String> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(chars -> chars.getValue() == 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect);

    }
}
