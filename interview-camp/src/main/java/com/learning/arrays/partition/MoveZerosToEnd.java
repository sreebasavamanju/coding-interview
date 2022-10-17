package com.learning.arrays.partition;

import java.util.Arrays;

/**
 * Given an array of integers, rearrange the elements such that all zeros are moved to the end of
 * the array.
 */
public class MoveZerosToEnd {

  public static void main(String[] args) {
    int[] arr = new int[] {4, 2, 0, 1, 0, 3, 0};
    moveZerosToEnd(arr);
    System.out.println(Arrays.toString(arr));
  }

  /** Time Complexity: O(n) Space Complexity:O(1) */
  private static void moveZerosToEnd(int[] arr) {
    int boundary = arr.length - 1;

    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] == 0) {
        swap(arr, boundary, i);
        boundary--;
      }
    }
  }

  private static void swap(int[] arr, int boundary, int i) {
    int tmp = arr[i];
    arr[i] = arr[boundary];
    arr[boundary] = tmp;
  }
}
