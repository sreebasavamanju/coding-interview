package com.learning.arrays.subarray;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array of integers, both -ve and +ve, find a contiguous subarray that sums to 0. For
 * example: [2,4,-2,1,-3,5,-3] --> [4,-2,1,-3]
 */
public class SubArrarySum {

  public static void main(String[] args) {
    int[] arr = {2, 4, -2, 1, -3, 5, -3};
    int target = 0;
    int[] zeroSumSubArray = zeroSumSubArray(arr, target);
    System.out.println(Arrays.toString(zeroSumSubArray));
  }

  /**
   * Time Complexity: O(n) Space Complexity: O(n)
   *
   * @param target
   */
  public static int[] zeroSumSubArray(int[] arr, int target) {
    if (arr == null || arr.length == 0) {
      return null;
    }
    int sum = 0;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (sum == target) {
        return new int[] {0, i};
      }
      if (map.containsKey(sum - target)) {
        return new int[] {map.get(sum) + 1, i};
      }
      map.put(sum, i);
    }
    return null;
  }
}
