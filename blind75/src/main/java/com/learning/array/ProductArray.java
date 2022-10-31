package com.learning.array;

import java.util.Arrays;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product
 * of all the elements of nums except nums[i].
 *
 * <p>The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * <p>You must write an algorithm that runs in O(n) time and without using the division operation.
 */
public class ProductArray {

  public static void main(String[] args) {
    //
    int[] result = arrayOfProducts(new int[] {1, 2, 3, 4});
    System.out.println(Arrays.toString(result));
    System.out.println(Arrays.toString(arrayOfProducts(new int[] {-1, 1, 0, -3, 3})));
  }

  /**
   * Space Complexity: O(n)
   * Time Complexity: O(n)
   */
  private static int[] arrayOfProducts(int[] arr) {
    int temp = 1;
    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      result[i] = 1;
    }

    // product of all except left one.
    for (int i = 0; i < arr.length; i++) {
      result[i] = temp;
      temp *= arr[i];
    }

    // product of all except right one.
    temp = 1;
    for (int i = arr.length - 1; i >= 0; i--) {
      result[i] *= temp;
      temp *= arr[i];
    }
    return result;
  }
}
