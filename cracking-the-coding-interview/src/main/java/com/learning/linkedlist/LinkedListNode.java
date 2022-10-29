package com.learning.linkedlist;

public class LinkedListNode {
  public LinkedListNode next;
  public LinkedListNode prev;
  public LinkedListNode last;
  public int data;

  public LinkedListNode(int d, LinkedListNode n, LinkedListNode p) {
    data = d;
    setNext(n);
    setPrevious(p);
  }

  public LinkedListNode(int d) {
    data = d;
  }

  public LinkedListNode() {}

  public void setNext(LinkedListNode n) {
    next = n;
    if (this == last) {
      last = n;
    }
    if (n != null && n.prev != this) {
      n.setPrevious(this);
    }
  }

  public void setPrevious(LinkedListNode p) {
    prev = p;
    if (p != null && p.next != this) {
      p.setNext(this);
    }
  }

  public String printForward() {
    if (next != null) {
      return data + "->" + next.printForward();
    } else {
      return ((Integer) data).toString();
    }
  }

  public LinkedListNode clone() {
    LinkedListNode next2 = null;
    if (next != null) {
      next2 = next.clone();
    }
    LinkedListNode head2 = new LinkedListNode(data, next2, null);
    return head2;
  }

  public static LinkedListNode createLinkedListFromArray(int[] vals) {
    LinkedListNode head = new LinkedListNode(vals[0], null, null);
    LinkedListNode current = head;
    for (int i = 1; i < vals.length; i++) {
      current = new LinkedListNode(vals[i], null, current);
    }
    return head;
  }

  public static LinkedListNode randomLinkedList(int N, int min, int max) {
    LinkedListNode root = new LinkedListNode(randomIntInRange(min, max),
            null, null);
    LinkedListNode prev = root;
    for (int i = 1; i < N; i++) {
      int data = randomIntInRange(min, max);
      LinkedListNode next = new LinkedListNode(data, null, null);
      prev.setNext(next);
      prev = next;
    }
    return root;
  }

  public static int randomIntInRange(int min, int max) {
    return randomInt(max + 1 - min) + min;
  }

  public static int randomInt(int n) {
    return (int) (Math.random() * n);
  }

}
