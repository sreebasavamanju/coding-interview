package com.learning.arrays.partition;

import java.util.Arrays;

public class MoveZeroSToStart {

  public static void main(String[] args) {
    int[] arr = {4, 2, 0, 1, 0, 3, 0};
    moveZerosToBeginning(arr);
    System.out.println(Arrays.toString(arr));
  }

  /** Time Complexity: O(n) Space Complexity:O(1) */
  private static void moveZerosToBeginning(int[] arr) {
    if (arr == null || arr.length == 0) {
      return;
    }
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        swap(arr, index, i);
        index++;
      }
    }
  }

  private static void swap(int[] arr, int index, int i) {
    int tmp = arr[index];
    arr[index] = arr[i];
    arr[i] = tmp;
  }
}
