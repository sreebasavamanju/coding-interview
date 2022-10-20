package com.learning;

import java.util.Arrays;

/**
 * Given an array, return an array where each index stores the product of all numbers except the
 * number on the index itself.
 */
public class ArrayOfProducts {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4};
    int[] products = findProducts(arr);
    System.out.println(Arrays.toString(products));
  }

  /**
   * Time complexity: O(n)
   * Space Complexity: O(n)
   */
  private static int[] findProducts(int[] arr) {
    int temp = 1;
    int[] result = new int[arr.length];
    // except left one.
    for (int i = 0; i < arr.length; i++) {
      result[i] = temp;
      temp *= arr[i];
    }
    temp = 1;
    for (int i = arr.length - 1; i >= 0; i--) {
      result[i] *= temp;
      temp *= arr[i];
    }
    return result;
  }
}
