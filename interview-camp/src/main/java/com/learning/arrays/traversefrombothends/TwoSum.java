package com.learning.arrays.traversefrombothends;

import java.util.Arrays;

/**
 * 2 Sum Problem: Given a sorted array of integers, find two numbers in the array that sum to a
 * given integer target.
 */
public class TwoSum {

  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 5, 6, 7};
    int target = 11;
    int[] pair = twoSumPair(arr, target);
    System.out.println(Arrays.toString(pair));
  }

  /** Time Complexity: O(n) Space Complexity: O(1) */
  private static int[] twoSumPair(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int sum = arr[low] + arr[high];
      if (sum > target) {
        high--;
      } else if (sum < target) {
        low++;
      } else {
        return new int[] {arr[low], arr[high]};
      }
    }

    return null;
  }
}
