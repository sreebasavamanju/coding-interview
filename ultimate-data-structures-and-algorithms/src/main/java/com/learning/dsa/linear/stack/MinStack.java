package com.learning.dsa.linear.stack;

import java.util.Stack;

/**
 * Time complexity for all the methods is O(1)
 * Space Complexity for maintaining minstack is O(n)
 */
public class MinStack extends Stack<Integer> {
  Stack<Integer> minStack = new Stack<>();

  public void push(int item) {
    if (isEmpty()) {
      super.push(item);
      minStack.push(item);
    } else {
      super.push(item);
      Integer peek = minStack.peek();
      if (item <= peek) {
        minStack.push(item);
      }
    }
  }

  public Integer pop() {
    int x = super.pop();
    int y = minStack.pop();
    if (y != x) {
      minStack.push(y);
    }
    return x;
  }

  public Integer getMin() {
    return minStack.peek();
  }
}
