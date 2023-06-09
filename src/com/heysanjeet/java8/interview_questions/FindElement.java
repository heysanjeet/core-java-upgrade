package com.heysanjeet.java8.interview_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindElement {
    public static void main(String[] args) {
        int[] nums = {5, 46, 2, 5, 3, 7, 4, 63, 2, 11, 64, 5, 3, 1};
        //find element who start with 1
        List<String> numsStartWith1 = Arrays.stream(nums).boxed().map(num -> num + "")//convert into list of String
                .filter(value -> value.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(numsStartWith1);//11,1

    }
}
