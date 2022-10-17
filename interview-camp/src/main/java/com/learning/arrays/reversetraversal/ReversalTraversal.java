package com.learning.arrays.reversetraversal;

import java.util.Arrays;

/**
 * Given an array of numbers, replace each even number with two of the same number. e.g,
 * [1,2,5,6,8,-1,-1,-1] -> [1,2,2,5,6,6,8,8]. Assume that the array has the exact amount of space to
 * accommodate the result
 */
public class ReversalTraversal {

  public static void main(String[] args) {
    int[] arr = {1, 2, 5, 6, 8, -1, -1, -1};
    int[] evenClone = evenClone(arr);
    System.out.println(Arrays.toString(evenClone));
  }

  /** Time Complexity: O(n) Space Complexity: O(1) */
  private static int[] evenClone(int[] arr) {
    int firstIndex = findfirstNumber(arr);
    int lastIndex = arr.length;
    while (firstIndex >= 0) {
      if (arr[firstIndex] % 2 == 0) {
        lastIndex--;
        arr[lastIndex] = arr[firstIndex];
        lastIndex--;
        arr[lastIndex] = arr[firstIndex];
      } else {
        lastIndex--;
        arr[lastIndex] = arr[firstIndex];
      }
      firstIndex--;
    }

    return arr;
  }

  private static int findfirstNumber(int[] arr) {

    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] != -1) {
        return i;
      }
    }

    return -1;
  }
}
