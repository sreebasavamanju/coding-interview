package com.learning.dsa.linear.stack;

import java.util.Arrays;

public class Stack {
  // push
  // pop
  // peek
  // isEmpty
  private int count = 0;
  private int[] arr;

  public Stack(int size) {
    arr = new int[size];
  }

  public void push(int item) {
    if (count == arr.length) {
      throw new StackOverflowError();
    }
    arr[count++] = item;
  }

  public int pop() {
    if (isEmpty()) {
      throw new IllegalStateException();
    }
    return arr[--count];
  }

  public int peek() {
    if (isEmpty()) {
      throw new IllegalStateException();
    }
    return arr[count - 1];
  }

  public boolean isEmpty() {
    return count == 0;
  }

  @Override
  public String toString() {
    return Arrays.toString(Arrays.copyOfRange(arr, 0, count));
  }
}
