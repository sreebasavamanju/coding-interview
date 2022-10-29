package com.learning.linkedlist;

import java.util.HashSet;
import java.util.Set;

/** Write code to remove duplicates from an unsorted linked list. */
public class DeleteDups {

  /**
   * Time Complexity: O(n) n is the no. of nodes in a linkedlist. Sapce Complexity: O(n)
   *
   * @param node
   */
  private static void deleteDups(LinkedListNode node) {
    Set<Integer> set = new HashSet<>();
    LinkedListNode prev = null;
    while (node != null) {
      if (set.contains(node.data)) {
        prev.next = node.next;
      } else {
        set.add(node.data);
        prev = node;
      }
      node = node.next;
    }
  }

  public static void main(String[] args) {
    LinkedListNode first =
        new LinkedListNode(0, null, null); // AssortedMethods.randomLinkedList(1000, 0, 2);
    LinkedListNode head = first;
    LinkedListNode second = first;
    for (int i = 1; i < 8; i++) {
      second = new LinkedListNode(i % 2, null, null);
      first.setNext(second);
      second.setPrevious(first);
      first = second;
    }
    System.out.println(head.printForward());
    deleteDups(head);
    System.out.println(head.printForward());
  }
}
