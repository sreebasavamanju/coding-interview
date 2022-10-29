package com.learning.dsa.nonlinear.heaps;

public class Heap {
  private int[] items;
  private int size;

  public Heap(int size) {
    this.items = new int[size];
  }

  public void insert(int value) {
    if(isFull()){
      throw new IllegalStateException();
    }
    items[size++] = value;
    // bubble up.
    // new item > parent need to swap.
    bubbleUp();
  }

  /**
   * Always going to remove ROOT node.
   */
  public void remove(){
    items[0]=items[--size];
    // bubble down operation need to taken care.
  }

  private int leftChildIndex(int index){
    return index*2+1;
  }

  private int rightChildIndex(int index){
    return index*2+2;
  }
  public boolean isFull(){
    return size==items.length;
  }

  private void bubbleUp() {
    int index = size - 1;
    int parntIndex = (index - 1) / 2;
    while (index > 0 && items[index] > items[parent(index)]) {
      swap(index, parent(index));
      index = parent(index);
    }
  }

  private int parent(int index) {
    return (index - 1) / 2;
  }

  private void swap(int i, int j) {
    int temp = items[i];
    items[i] = items[j];
    items[j] = temp;
  }
}
