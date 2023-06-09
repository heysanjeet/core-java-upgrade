package com.heysanjeet.java8.interview_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;


public class FindSecondHighestNo {
    public static void main(String[] args) {
        int[] array = {5, 9, 11, 2, 8, 21, 1};
        //find second highest
        /*Integer integer = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
                .get(1);*/
        //System.out.println(integer);

        Integer secondH = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
                .stream().skip(1).findFirst().get();
        System.out.println(secondH);
    }
}
