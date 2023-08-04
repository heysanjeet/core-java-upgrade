package com.heysanjeet.interview_questions;

public class FindTriptet {
    public static void main(String[] args) {
        int[] array = {4, 3, 54, 7, 4, 8, 8, 2, 7, 3, 5, 4};
        printTriplet(array, 61);
    }

    public static void printTriplet(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if ((array[i] + array[j] + array[k]) == target) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
}
