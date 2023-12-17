package com.heysanjeet.algorithms.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] input={4,5,1,2,6,3};
        int[] result=insertionSort(input);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }

    //always start from 2nd item
    //if array is sorted tc=O(n)
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j > -1 && temp < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        return array;
    }
}
