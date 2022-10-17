package com.learning.dsa.linear.queue;

import java.util.EmptyStackException;
import java.util.Stack;

public class QueueUsingStack {

  private Stack<Integer> stack1 = new Stack<>();
  private Stack<Integer> stack2 = new Stack<>();

  public void enqueue(int item) {
    stack1.push(item);
  }

  public int dequeue() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    moveStack1ToStack2();
    return stack2.pop();
  }

  private void moveStack1ToStack2() {
    if (stack2.isEmpty()) {
      while (stack1.isEmpty()) {
        stack2.push(stack1.pop());
      }
    }
  }

  public boolean isEmpty() {
    return stack1.isEmpty() && stack2.isEmpty();
  }

  public int peek() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    moveStack1ToStack2();
    return stack2.peek();
  }
}
