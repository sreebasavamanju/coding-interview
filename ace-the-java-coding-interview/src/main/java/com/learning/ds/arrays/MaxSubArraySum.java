package com.learning.ds.arrays;

/**
 * Given an unsorted array A, the maximum sum sub-array is the sub-array (contiguous elements)
 * from A for which the sum of the elements is maximum. In this challenge, we want to find the sum
 * of the maximum sum sub-array. This problem is a tricky one because the array might have negative
 * integers in any position, so we have to cater to those negative integers while choosing the
 * contiguous subarray with the largest positive values.
 */
public class MaxSubArraySum {
  public static void main(String[] args) {
    int[] arr = {1, 7, -2, -5, 10, -1};
    System.out.println(findMaxSumSubArray(arr));
  }

  /** Time Complexity: O(n) Space Complexity: O(1) */
  private static int findMaxSumSubArray(int[] arr) {
    if (arr.length == 0) {
      return 0;
    }
    int maxHere = arr[0];
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      maxHere = Math.max(arr[i], arr[i] + maxHere);
      max = Math.max(max, maxHere);
    }
    return max;
  }
}
