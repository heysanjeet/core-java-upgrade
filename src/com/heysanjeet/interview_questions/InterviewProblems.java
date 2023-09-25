package com.heysanjeet.interview_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewProblems {
    public static void main(String[] args) {
        //1- find numbers start with 4
        List<String> result = Arrays.asList(1, 2, 43, 34, 2, 43, 4, 5).stream().map(val -> val.toString()).filter(nums -> nums.startsWith("4")).collect(Collectors.toList());
        System.out.println(result);//43,43,4

        //2- Write a Java program to display those starting with A and having length of 3 characters.
        String s[] = {"AB", "ABC", "BC", "BCD", "AAA", "BBB"};
        List<String> output = Arrays.stream(s).filter(val -> val.startsWith("A") && val.length() == 3).collect(Collectors.toList());
        System.out.println(output);



    }
}
