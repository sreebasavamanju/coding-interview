package com.learning.dsa.linear.hashtable;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {

  public static void main(String[] args) {
    String s = "green apple";
    Character firstRepeat = firstRepeat(s);
    System.out.println(firstRepeat);
  }

  private static Character firstRepeat(String s) {

    Set<Character> set = new HashSet<>();
    for (Character ch : s.toCharArray()) {
      if (!set.add(ch)) {
        return ch;
      }
    }
    return Character.MIN_VALUE;
  }
}
