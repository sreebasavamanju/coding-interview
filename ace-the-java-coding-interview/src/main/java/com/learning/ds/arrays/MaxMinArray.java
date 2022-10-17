package com.learning.ds.arrays;

import java.util.Arrays;

/**
 * In this problem, you have to implement the void maxMin(int[] arr) method. This will re-arrange
 * the elements of a sorted array in such a way that the first position will have the largest
 * number, the second will have the smallest, the third will have the second-largest, and so on.
 * Note: The given array is sorted in ascending order. Note: The range of integers in the array can
 * be from 0 to 10000.
 */
public class MaxMinArray {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    maxMin(arr);
    System.out.println(Arrays.toString(arr));
  }

  /**
   * Time Complexity: O(2n) -> O(n) Space Complexity: O(1) Key is matthematical Formaula
   * (a[index]%max)*max, if the integer range is max it leads to data loss.
   */
  private static void maxMin(int[] arr) {
    int minIndex = 0;
    int maxIndex = arr.length - 1;
    int maxElem = arr[maxIndex] + 1;

    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) { // even index store max elements.
        arr[i] += (arr[maxIndex] % maxElem) * maxElem;
        maxIndex--;
      } else { // odd index store min elements.
        arr[i] += (arr[minIndex] % maxElem) * maxElem;
        minIndex++;
      }
    }

    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] / maxElem;
    }
  }
}
