package com.heysanjeet.algorithms.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] input = {2, 4, 5, 6, 1, 3};
        int[] result = bubbleSort(input);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {//n-1 comparison required
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
