package com.heysanjeet.java8.interview_questions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SkipLimit {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 10);
        //print only 2 to 9
        List<Integer> intList = intStream.boxed().skip(1).limit(8).collect(Collectors.toList());
        System.out.println(intList);
    }
}
