package com.learning.arrays.subarray;

/**
 * Given an array of integers that can be both +ve and -ve, find the contiguous subarray with the
 * largest sum. For example: [1,2,-1,2,-3,2,-5] -> first 4 elements have the largest sum. Return
 * (0,3)
 *
 * <p>Return largestSum
 */
public class KadanesAlgorithm {

  public static void main(String[] args) {
    int maxSum = maxSubArraySum(new int[] {1, 2, -1, 2, -3, 2, -5});
    System.out.println(maxSum);
  }

  private static int maxSubArraySum(int[] arr) {
    if (arr == null || arr.length == 0) {
      return 0;
    }

    int maxHere = arr[0];
    int maxSum = 0;
    for (int i = 1; i <= arr.length - 1; i++) {
      maxHere = Math.max(arr[i], maxHere + arr[i]);
      maxSum = Math.max(maxSum, maxHere);
    }
    return maxSum;
  }
}
