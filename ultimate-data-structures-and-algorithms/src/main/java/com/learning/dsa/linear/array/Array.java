package com.learning.dsa.linear.array;

public class Array {

  private int[] items;
  private int count = 0;

  public Array(int length) {
    this.items = new int[length];
  }

  public void insert(int val) {
    resizeIfRequired();
    items[count] = val;
    count++;
  }

  public void insertAt(int val, int index) {
    if (index < 0 || index > count) {
      throw new IllegalStateException();
    }
    resizeIfRequired();
    for (int i = count - 1; i >= index; i--) {
      items[i + 1] = items[i];
    }
    items[index] = val;
    count++;
  }

  private void resizeIfRequired() {
    if (items.length == count) {
      int newSize = items.length * 2;
      int[] newItems = new int[newSize];
      for (int i = 0; i < count; i++) {
        newItems[i] = items[i];
      }
      items = newItems;
    }
  }

  public void removeAt(int i) {
    if (i < count && i >= 0) {
      for (int j = i; j < count; j++) {
        items[j] = items[j + 1];
      }
      count--;
    } else {
      throw new ArrayIndexOutOfBoundsException();
    }
  }

  public int indexOf(int val) {

    for (int i = 0; i < count; i++) {
      if (items[i] == val) {
        return i;
      }
    }
    return -1;
  }

  public void print() {

    for (int i = 0; i < count; i++) {
      System.out.println(items[i]);
    }
  }

  // o(n)
  public int max() {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < count; i++) {
      if (max > items[i]) {
        max = items[i];
      }
    }
    return max;
  }

  public Array intersect(Array other) {
    Array intersection = new Array(count);

    for (int item : items) if (other.indexOf(item) >= 0) intersection.insert(item);

    return intersection;
  }

  public void reverse() {
    int low = 0;
    int high = count - 1;
    while (low <= high) {
      swap(low, high);
      low++;
      high--;
    }
  }

  private void swap(int low, int high) {
    int temp = items[low];
    items[low] = items[high];
    items[high] = temp;
  }
}
