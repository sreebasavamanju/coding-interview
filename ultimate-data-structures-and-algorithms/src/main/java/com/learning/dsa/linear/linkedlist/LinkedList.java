package com.learning.dsa.linear.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {

  private Node head;
  private Node tail;
  private int size;

  public void addLast(int item) {
    Node node = new Node(item);

    if (isEmpty()) {
      head = node;
      tail = node;
    } else {
      tail.next = node;
      tail = node;
    }
    size++;
  }

  // addFirst
  // addLast
  // deleteFirst
  // deleteLast
  // contains
  // indexOf

  public void addFirst(int item) {
    Node node = new Node(item);
    if (isEmpty()) {
      head = node;
      tail = node;
    } else {
      node.next = head;
      head = node;
    }
    size++;
  }

  public int indexOF(int item) {
    int index = 0;
    Node curr = head;

    while (curr != null) {
      if (curr.value == item) {
        return index;
      }
      curr = curr.next;
    }
    return -1;
  }

  public boolean contains(int item) {
    return indexOF(item) != -1;
  }

  public void removeFirst() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }

    if (head == tail) {
      head = tail = null;
      size--;
      return;
    }
    Node next = head.next;
    head.next = null;
    head = next;
    size--;
  }

  public void removeLast() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    if (head == tail) {
      head = tail = null;
      size--;
      return;
    }
    Node prev = getPreviousNode(tail);
    prev.next = null;
    tail = prev;
    size--;
  }

  private Node getPreviousNode(Node node) {
    Node curr = head;
    while (curr != null) {
      if (curr.next == node) {
        return curr;
      }
      curr = curr.next;
    }
    return null;
  }

  public int size() {
    return size;
  }

  private boolean isEmpty() {
    return head == null;
  }

  public int[] toArray() {
    int[] array = new int[size];
    Node curr = head;
    int index = 0;
    while (curr != null) {
      array[index++] = curr.value;
      curr = curr.next;
    }
    return array;
  }

  public void reverse() {

    if (isEmpty()) {
      return;
    }
    Node curr = head;
    Node next = null;
    Node prev = null;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    tail = head;
    tail.next = null;
    head = prev;
  }

  public int getKthNodeFromEnd(int k) {

    if (k <= 0) {
      throw new IllegalArgumentException();
    }

    if (isEmpty()) {
      throw new IllegalStateException();
    }

    Node fast = head;
    for (int i = 0; i < k - 1; i++) {
      fast = fast.next;
      if (fast == null) {
        throw new IllegalArgumentException();
      }
    }
    Node slow = head;

    while (fast != tail) {
      slow = slow.next;
      fast = fast.next;
    }
    return slow.value;
  }

  public void printMiddle() {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    System.out.println(slow.value);
  }

  public boolean hasLoop() {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }

  private class Node {

    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }
  }
}
