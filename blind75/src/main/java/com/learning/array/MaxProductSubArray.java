package com.learning.array;

/**
 * Given an integer array nums, find a contiguous non-empty subarray within the array that has the
 * largest product, and return the product.
 *
 * <p>The test cases are generated so that the answer will fit in a 32-bit integer.
 *
 * <p>A subarray is a contiguous subsequence of the array.
 */
public class MaxProductSubArray {
  public static void main(String[] args) {
    System.out.println(maxProductSubArray(new int[] {2, 3, -2, 4}));
    System.out.println(maxProductSubArray(new int[] {-2, 0, -1}));
  }

  /**
   * Time Complexity: O(n)
   *
   * <p>Space Complexity: O(1)
   *
   * <p>Similar to Kadane's algorithm , just tweak the logic to support product
   */
  private static int maxProductSubArray(int[] arr) {
    int maxHere = 1;
    int maxProduct = 0;
    for (int i = 0; i < arr.length; i++) {
      maxHere = Math.max(arr[i], arr[i] * maxHere);
      maxProduct = Math.max(maxProduct, maxHere);
    }
    return maxProduct;
  }
}
