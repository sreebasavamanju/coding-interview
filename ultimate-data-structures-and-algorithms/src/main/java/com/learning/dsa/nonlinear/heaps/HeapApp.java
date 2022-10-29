package com.learning.dsa.nonlinear.heaps;

public class HeapApp {
  public static void main(String[] args) {
    Heap heap = new Heap(10);
    heap.insert(10);
    heap.insert(5);
    heap.insert(17);
    heap.insert(4);
    heap.insert(22);
    System.out.println("Done");
  }
}
