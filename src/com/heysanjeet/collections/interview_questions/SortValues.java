package com.heysanjeet.collections.interview_questions;

public class SortValues {
    public static void main(String[] args) {
        int array[] = {5, 4, 6, 2, 1, 8, 9, 4, 7, 4, 3, 0};
        int[] result = insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int currentMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[currentMin]) {//we found the current min
                    currentMin = j;
                }
            }
            int temp = array[i];
            array[i] = array[currentMin];
            array[currentMin] = temp;
        }
        return array;
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return array;
    }
}
