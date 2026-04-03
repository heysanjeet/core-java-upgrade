package com.heysanjeet.java8.interview_questions;

import java.util.Arrays;

public class LongestString {
    public static void main(String[] args) {
        /**
         *Find the longest string in an array of strings.
         */
        String[] city = {"Bangalore", "Pune", "Patna", "Mumbai", "Hydrabad"};
        //find longest string
        String longestString = Arrays.stream(city).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(longestString);
    }
}
