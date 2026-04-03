package com.heysanjeet.java8.interview_questions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurancesInString {
    public static void main(String[] args) {

        /**
         * Count the frequency of each character in a string.
         */
        String str = "welcometojava";
        Map<String, Long> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);


    }
}
