package com.heysanjeet.java8.interview_questions;
import java.util.Arrays;
import java.util.List;

public class JoinString {
    public static void main(String[] args) {
        //string join
        //1-2-3-4-5
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        String result = String.join("-", strings);
        System.out.println(result);
    }
}
