package com.learning.dsa.linear.linkedlist;

import java.util.Arrays;

public class LinkedListApp {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
//		list.removeFirst();
		System.out.println(list.contains(10));
		System.out.println(list.size());
		System.out.println(Arrays.toString(list.toArray()));
//		list.reverse();
//		System.out.println(Arrays.toString(list.toArray()));
		
		System.out.println(list.getKthNodeFromEnd(4));
	}
}
