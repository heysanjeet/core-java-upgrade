package com.heysanjeet.algorithms.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        System.out.println(searchValue(array, 50));//4
    }

    public static int searchValue(int[] array, int target) {
        int start = 0;
        int end = array.length;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
