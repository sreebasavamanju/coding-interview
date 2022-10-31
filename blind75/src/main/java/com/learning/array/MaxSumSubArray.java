package com.learning.array;

/** Given an integer array nums, find the subarray which has the largest sum and return its sum. */
public class MaxSumSubArray {

  public static void main(String[] args) {
    //
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    System.out.println(maxSubArraySum(arr));
    System.out.println(maxSubArraySum(new int[] {1}));
    System.out.println(maxSubArraySum(new int[] {5, 4, -1, 7, 8}));
  }

  /**
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   * Kadane's Algorithm
   */
  private static int maxSubArraySum(int[] arr) {
    int maxHere = 0;
    int maxSum = 0;
    for (int i = 0; i < arr.length; i++) {
      maxHere = Math.max(arr[i], arr[i] + maxHere);
      maxSum = Math.max(maxSum, maxHere);
    }
    return maxSum;
  }
}
