package com.learning.arraysandstrings;

/** Given two strings, write a method to decide if one is a permutation of the other. */
public class PerMutationCheck {
  public static void main(String[] args) {}

  /** Time Complexity: O(n+m) Space Complexity: o(c) c is the size of character set. */
  private static boolean permutation(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    int[] letters = new int[128];

    for (int ch : s.toCharArray()) {
      letters[ch]++;
    }

    for (int ch : t.toCharArray()) {
      letters[ch]--;
      if (letters[ch] < 0) {
        return false;
      }
    }
    return true;
  }
}
