package com.heysanjeet.interview_questions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountCharFrequency {
    public static void main(String[] args) {
        Map<String, Long> result = countCharFrequency("SAanjeet");
        System.out.println(result);

    }

    public static Map<String, Long> countCharFrequency(String input) {
        return Arrays.stream(input.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(val -> val, Collectors.counting()));
    }
}
