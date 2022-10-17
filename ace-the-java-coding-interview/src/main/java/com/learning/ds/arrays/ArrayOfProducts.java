package com.learning.ds.arrays;

import java.util.Arrays;

/*
 * In this problem, you have to implement the int[] findProduct(int[] arr) method which will modify arr in such a way that in the output,
 * each index i will contain the product of all elements present in arr except the element stored on that index i.
 */
public class ArrayOfProducts {

  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4};
    int[] findProducts = findProducts(arr);
    System.out.println(Arrays.toString(findProducts));
  }

  /*
   * Time complexity: O(n)
   * Space Complexity: O(n)
   */
  private static int[] findProducts(int[] arr) {

    int temp = 1;

    // left multiply except arr[i]
    int result[] = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      result[i] = temp;
      temp *= arr[i];
    }

    temp = 1;
    // right multiply except arr[i]
    for (int i = arr.length - 1; i >= 0; i--) {
      result[i] *= temp;
      temp *= arr[i];
    }
    return result;
  }
}
