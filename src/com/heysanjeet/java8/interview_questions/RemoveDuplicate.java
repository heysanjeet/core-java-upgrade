package com.heysanjeet.java8.interview_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] array={1,1,2,3,4,4,5,6,8,8,9,1,0};
        //remove duplicate using list
        List<Integer> distinctValue = Arrays.stream(array).boxed().distinct().collect(Collectors.toList());
        System.out.println(distinctValue);
    }
}
