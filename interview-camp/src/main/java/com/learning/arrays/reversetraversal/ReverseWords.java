package com.learning.arrays.reversetraversal;

/**
 * Given a sentence, reverse the words of the sentence. For example, "i live in a house" becomes
 * "house a in live i
 */
public class ReverseWords {

  public static void main(String[] args) {
    String s = "i live in a house";
    String reverse = reverse(s);
    System.out.println(reverse);
  }
  /** Time Complexity: O(n) Space Complexity: O(n) */
  private static String reverse(String s) {
    StringBuilder builder = new StringBuilder();
    int currentIndex = s.length();
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == ' ') {
        currentIndex = substringWord(s, builder, currentIndex, i);
      }
    }
    // add first word.
    substringWord(s, builder, currentIndex, 0);
    return builder.toString();
  }

  private static int substringWord(String s, StringBuilder builder, int currentIndex, int i) {
    if (builder.length() > 0) {
      builder.append(" ");
    }
    builder.append(s.substring(i + 1, currentIndex));
    currentIndex = i;
    return currentIndex;
  }
}
