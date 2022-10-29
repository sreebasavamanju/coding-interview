package com.learning.arraysandstrings;

public class IsUnique {
  public static void main(String[] args) {
    String[] words = {"abcde", "hello", "apple", "kite", "padle"};
    for (String word : words) {
      System.out.println(word + ": " + isUniqueChars(word));
    }
  }

  /** Time Complexity: O(n) Space Complexity: O(c) - c is the size of character set. */
  private static boolean isUniqueChars(String str) {
    if (str.length() > 128) {
      return false;
    }
    boolean[] charSet = new boolean[128];

    for (int ch : str.toCharArray()) {
      if (charSet[ch]) {
        return false;
      }
      charSet[ch] = true;
    }
    return true;
  }
}
