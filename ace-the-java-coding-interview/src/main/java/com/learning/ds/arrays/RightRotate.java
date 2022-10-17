package com.learning.ds.arrays;

import java.util.Arrays;

/**
 * In this problem, you have to implement the void rotateArray(int[] arr) method, which takes an arr
 * and rotate it right by 1. This means that the right-most elements will appear at the left-most
 * position in the array.
 */
public class RightRotate {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    rotateArray(arr, 1);
    System.out.println(Arrays.toString(arr));
  }

  /**
   * Time Complexity: (n * d): n- no of elements in array, d- no of times to rotate. Space
   * Complexity:O(1) Beeter Solution should be implementing juggling algo: read this
   * https://iq.opengenus.org/juggling-algorithm/
   */
  private static void rotateArray(int[] arr, int k) {
    int p = 1;
    while (p <= k) {
      int lasElement = arr[arr.length - 1];
      for (int i = arr.length - 1; i > 0; i--) {
        arr[i] = arr[i - 1];
      }
      arr[0] = lasElement;
      p++;
    }
  }
}
