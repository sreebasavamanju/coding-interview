package com.learning.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and
 * return false if every element is distinct.
 */
public class ContainsDuplicate {
  public static void main(String[] args) {
    System.out.println(containsDuplicate(new int[] {1, 2, 3, 1}));
    System.out.println(containsDuplicate(new int[] {1, 2, 3, 4}));
    System.out.println(containsDuplicate(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
  }

  /** Time Complexity : O(n) Space Complexity: O(n) */
  private static boolean containsDuplicate(int[] arr) {
    if (arr == null || arr.length == 0) {
      return false;
    }
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      if (!set.add(arr[i])) {
        return true;
      }
    }
    return false;
  }
}
