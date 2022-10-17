package com.learning.arrays.traversefrombothends;

import java.util.Arrays;

/**
 * Given a sorted array in non-decreasing order, return an array of squares of each number, also in
 * non-decreasing order. For example: [-4,-2,-1,0,3,5] -> [0,1,4,9,16,25]
 */
public class SortedSquares {

  public static void main(String[] args) {
    int result[] = sortedSquares(new int[] {-4, -2, -1, 0, 3, 5});
    System.out.println(Arrays.toString(result));
  }

  /** Time Complexity: O(n) Space Complexity:O(n) */
  private static int[] sortedSquares(int[] arr) {
    int[] result = new int[arr.length];
    int low = 0;
    int high = arr.length - 1;
    int index = arr.length - 1;
    while (low < high) {
      if (Math.abs(arr[low]) > Math.abs(arr[high])) {
        result[index] = arr[low] * arr[low];
        low++;
      } else {
        result[index] = arr[high] * arr[high];
        high--;
      }
      index--;
    }

    return result;
  }
}
