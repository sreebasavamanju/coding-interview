package com.learning.linkedlist;

/**
 * In this problem, you are not given access to the head of the linked list. You only have access to
 * that node. The solution is simply to copy the data from the next node over to the current node,
 * and then to delete the next node.
 */
public class DeleteNode {
    public static boolean deleteNode(LinkedListNode n) {
        if (n == null || n.next == null) {
            return false; // Failure
        }
        LinkedListNode next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }

    public static void main(String[] args) {
        LinkedListNode head = LinkedListNode.randomLinkedList(10, 0, 10);
        System.out.println(head.printForward());
        deleteNode(head.next.next.next.next); // delete node 4
        System.out.println(head.printForward());
    }
}
