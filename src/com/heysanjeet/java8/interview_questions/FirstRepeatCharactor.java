package com.heysanjeet.java8.interview_questions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatCharactor {
    public static void main(String[] args) {
        String str = "iloveyou";
        String firstRepeat = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(mapItems -> mapItems.getValue() > 1)
                .findFirst().get().getKey();
        System.out.println(firstRepeat);
    }
}

