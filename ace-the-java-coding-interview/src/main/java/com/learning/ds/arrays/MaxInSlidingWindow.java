package com.learning.ds.arrays;

import java.util.Arrays;

/**
 * Given an integer array and a window of size w, find the current maximum value in the window as it
 * slides through the entire array. Sample input: nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] window_size
 * = 3 Expected output: [3, 4, 5, 6, 7, 8, 9, 10]
 */
public class MaxInSlidingWindow {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int windowSize = 3;
    int[] resultSum = maxSlidingWindow(nums, windowSize);
    System.out.println(Arrays.toString(resultSum));
  }

  /** Time Complexity: O(n) Space Complexity: O(1) */
  private static int[] maxSlidingWindow(int[] nums, int windowSize) {
    int[] result = new int[nums.length - windowSize + 1];
    int index = 0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      max = Math.max(nums[i], max);
      if (i >= windowSize - 1) {
        result[index] = max;
        index++;
      }
    }
    return result;
  }
}
