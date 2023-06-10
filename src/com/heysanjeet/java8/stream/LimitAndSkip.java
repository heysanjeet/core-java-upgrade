package com.heysanjeet.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitAndSkip {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //print value from 2 to 9
        List<Integer> collect = Arrays.stream(intArray).boxed().skip(1)
                .limit(8).collect(Collectors.toList());
        System.out.println(collect);
    }
}
