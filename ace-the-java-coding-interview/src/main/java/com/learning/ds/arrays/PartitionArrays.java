package com.learning.ds.arrays;

import java.util.Arrays;

/**
 * In this problem, you have to implement the void reArrange(int[] arr) method, which will sort the
 * elements, such that all the negative elements appear at the left and positive elements appear at
 * the right.
 */
public class PartitionArrays {
  public static void main(String[] args) {
    int[] arr = {10, -1, 20, 4, 5, -9, -6};
    reArrangeUsingDutchNationalFlag(arr, 0);
    System.out.println(Arrays.toString(arr));
    reArrange(new int[] {10, -1, 20, 4, 5, -9, -6});
    System.out.println(Arrays.toString(arr));
  }

  /** Time Complexity: O(n) Space Complexity: O(1) */
  private static void reArrangeUsingDutchNationalFlag(int[] arr, int pivot) {
    int lowBoundary = 0;
    int highBoundary = arr.length - 1;
    int i = 0;
    while (i <= highBoundary) {
      if (arr[i] == pivot) {
        i++;
      } else if (arr[i] > pivot) {
        swap(i, highBoundary, arr);
        highBoundary--;
      } else {
        swap(i, lowBoundary, arr);
        lowBoundary++;
        i++;
      }
    }
  }
  /** Time Complexity: O(n) Space Complexity: O(1) */
  private static void reArrange(int[] arr) {
    int boundary = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        swap(i, boundary, arr);
        boundary++;
      }
    }
  }

  private static void swap(int i, int highBoundary, int[] arr) {
    int temp = arr[i];
    arr[i] = arr[highBoundary];
    arr[highBoundary] = temp;
  }
}
