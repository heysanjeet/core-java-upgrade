package org.learning.database;

public class ArraysClient {
    static void main() {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(findMaxSum(nums,2));
    }

    /**
     *Find the maximum sum of a subarray of size k
     */
    public static int findMaxSum(int[] nums, int k){
        if(nums.length<k){
            return -1;
        }

        int maxSum=0;
        int currentSum=0;
        for(int i=0;i<k;i++){
            currentSum += nums[i];
        }
        maxSum=currentSum;

        for(int i=k;i<nums.length;i++){
            currentSum += nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
