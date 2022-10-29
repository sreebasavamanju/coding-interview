package com.learning.arraysandstrings;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is
 * a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of
 * letters. The palindrome does not need to be limited to just dictionary words. EXAMPLE Input: Tact
 * Coa Output: True (permutations: "taco cat'; "atco eta·; etc.)
 */
public class PalindromePermutation {

  private static int getCharNumber(Character c) {
    int a = Character.getNumericValue('a');
    int z = Character.getNumericValue('z');

    int val = Character.getNumericValue(c);
    if (a <= val && val <= z) {
      return val - a;
    }
    return -1;
  }

  private static int[] buildCharFrequencyTable(String phrase) {
    int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
    for (char c : phrase.toCharArray()) {
      int x = getCharNumber(c);
      if (x != -1) {
        table[x]++;
      }
    }
    return table;
  }

  /** Time Complexity: O(n) Space Complexity: O(c) c is the size of character set. */
  private static boolean isPermutationOfPalindrome(String phrase) {
    int[] table = buildCharFrequencyTable(phrase);
    return checkMaxOneOdd(table);
  }

  private static boolean checkMaxOneOdd(int[] table) {
    boolean foundOdd = false;

    for (int count : table) {
      if (count % 2 == 1) {
        if (foundOdd) {
          return false;
        }
        foundOdd = true;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String pali = "Rats live on no evil star";
    System.out.println(isPermutationOfPalindrome(pali));
  }
}
