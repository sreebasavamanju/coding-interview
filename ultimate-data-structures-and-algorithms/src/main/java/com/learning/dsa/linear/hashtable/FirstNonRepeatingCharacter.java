package com.learning.dsa.linear.hashtable;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

  public static void main(String[] args) {
    Character firstNonRepeat = firstNonRepeat("a green apple");
    System.out.println(firstNonRepeat);
  }

  private static Character firstNonRepeat(String s) {
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    char[] charArray = s.toCharArray();

    for (char ch : charArray) {
      int count = map.containsKey(ch) ? map.get(ch) : 0;
      map.put(ch, count + 1);
    }

    for (char ch : charArray) {
      if (map.get(ch) == 1) {
        return ch;
      }
    }
    return Character.MIN_VALUE;
  }
}
