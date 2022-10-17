package com.learning.ds.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * In this problem, you have to implement the int findFirstUnique(int[] arr) method that will look
 * for a first unique integer, which appears only once in the whole array. The function returns -1
 * if no unique number is found.
 */
public class FirstNonRepeat {
  public static void main(String[] args) {
    int[] arr = {9, 2, 3, 2, 6, 6};
    System.out.println(findFirstUnique(arr));
  }

  /** Time Complexity: O(n) Space Complexity: O(n) */
  private static int findFirstUnique(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i : arr) {
      int count = map.getOrDefault(i, 0);
      map.put(i, count + 1);
    }

    for (int i : arr) {
      if (map.get(i) == 1) {
        return i;
      }
    }
    return Integer.MIN_VALUE;
  }
}
