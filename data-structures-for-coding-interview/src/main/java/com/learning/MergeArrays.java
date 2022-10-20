package com.learning;

import java.util.Arrays;

/**
 * Given two sorted arrays, merge them into one array, which should also be sorted.
 */
public class MergeArrays {
  public static void main(String[] args) {
    int[] arr1 = {1, 3, 4, 5};
    int[] arr2 = {2, 6, 8};
    int[] result = mergeArrays(arr1, arr2);
    System.out.println(Arrays.toString(result));
  }

  /**
   * Time Complexity: O(n+m)
   * Space Complexity: O(n+m)
   */
  private static int[] mergeArrays(int[] arr1, int[] arr2) {
    int i = 0;
    int j = 0;
    int k = 0;
    int[] result = new int[arr1.length + arr2.length];
    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] > arr2[j]) {
        result[k] = arr2[j];
        j++;
      } else {
        result[k] = arr1[i];
        i++;
      }
      k++;
    }
    while (i < arr1.length) {
      result[k] = arr1[i];
      i++;
      k++;
    }
    while (j < arr2.length) {
      result[k] = arr2[j];
      j++;
      k++;
    }
    return result;
  }
}
