package com.learning.linkedlist;

/** Implement an algorithm to find the kth to last element of a singly linked list. */
public class ReturnKthToLast {
    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    private static  LinkedListNode kthToLast(LinkedListNode head, int k){
        LinkedListNode p1=head;
        LinkedListNode p2=head;
        for(int i=0;i<k;i++){
            if(p1==null){
                return null;
            }
            p1=p1.next;
        }

        while (p1!=null){
            p1=p1.next;
            p2=p2.next;
        }
        return p2;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3};
        LinkedListNode head = LinkedListNode.createLinkedListFromArray(array);
        System.out.println(head.printForward());
        for (int i = 0; i <= array.length + 1; i++) {
            LinkedListNode node = kthToLast(head, i);
            String nodeValue = node == null ? "null" : "" + node.data;
            System.out.println(i + ": " + nodeValue);
            if(node!=null){
                System.out.println(node.printForward());
            }
        }
    }
}
