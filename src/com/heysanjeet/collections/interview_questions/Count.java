package com.heysanjeet.collections.interview_questions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Count {
    public static void main(String[] args) {
        String name = "SsanjeetKumar";

        Map<String, Long> result = Arrays.stream(name.split("")).map(val->val.toLowerCase()).collect(Collectors.groupingBy(val -> val, Collectors.counting()));
        System.out.println(result);
    }


}
