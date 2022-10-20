package com.learning;

import java.util.Arrays;

/**
 * Given an array of size n, remove all even integers from it.
 */
public class RemoveEvenNumbers {
  public static void main(String[] args) {
    int[] arr = {1, 2, 4, 5, 10, 6, 3};
    int[] ints = removeEven(arr);
    System.out.println(Arrays.toString(ints));
  }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(k) - k is the no. of odd elements.
     */
  private static int[] removeEven(int[] arr) {
    int oddCount = 0;
    for (int a : arr) {
      if (a % 2 != 0) {
        oddCount++;
      }
    }
    int[] result = new int[oddCount];
    int index = 0;
    for (int a : arr) {
      if (a % 2 != 0) {
        result[index] = a;
        index++;
      }
    }

    return result;
  }
}
