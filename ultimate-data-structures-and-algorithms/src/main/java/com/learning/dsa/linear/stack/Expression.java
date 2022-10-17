package com.learning.dsa.linear.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

  private final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
  private final List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');
  private String input;
  public Expression(String input) {
    this.input = input;
  }

  public boolean isBalanced() {
    Stack<Character> stack = new Stack<Character>();
    for (Character c : input.toCharArray()) {
      if (isLeftBracket(c)) {
        stack.push('(');
      }

      if (isRightBracket(c)) {
        if (stack.isEmpty()) {
          return false;
        }

        Character pop = stack.pop();
        if (isBracketsMatched(c, pop)) {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }

  private boolean isBracketsMatched(Character right, Character left) {
    return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
  }

  private boolean isRightBracket(Character c) {
    return leftBrackets.contains(c);
  }

  private boolean isLeftBracket(Character c) {
    return rightBrackets.contains(c);
  }
}
