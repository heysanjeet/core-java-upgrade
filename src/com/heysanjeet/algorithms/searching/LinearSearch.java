package com.heysanjeet.algorithms.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {25, 73, 6, 4, 52, 2};
        System.out.println(search(array, 52));//5
    }

    public static int search(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
