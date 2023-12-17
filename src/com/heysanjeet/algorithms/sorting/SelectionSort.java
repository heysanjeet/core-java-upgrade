package com.heysanjeet.algorithms.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] input = {4, 2, 6, 5, 1, 3};
        int[] result = selectionSort(input);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;//replace if value is less
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }
}
