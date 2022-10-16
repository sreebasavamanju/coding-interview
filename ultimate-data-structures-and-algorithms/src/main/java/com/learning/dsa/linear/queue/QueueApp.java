package com.learning.dsa.linear.queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueApp {

	public static void main(String[] args) {
//		Queue<Integer> queue=new ArrayDeque<Integer>();
//		queue.add(10);
//		queue.add(20);
//		queue.add(30);
//		System.out.println(queue);
//		reverse(queue);
//		System.out.println(queue);
		
//		ArrayQueue queue=new ArrayQueue(5);
//		queue.enqueue(10);
//		queue.enqueue(20);
//		queue.enqueue(30);
//		System.out.println(queue);
//		System.out.println(queue.peek());
//		System.out.println(queue.dequeue());
//		System.out.println(queue);
//		queue.enqueue(40);
//		System.out.println(queue);
//		queue.enqueue(50);
//		queue.enqueue(60);
//		System.out.println(queue);
	//	queue.enqueue(70);
		
		PriorityQueue pq=new PriorityQueue(5);
		pq.add(10);
		pq.add(4);
		pq.add(3);
		pq.add(1);
		pq.add(2);
		System.out.println(pq);
		while(!pq.isEmpty()) {
			System.out.println(pq.remove());
			System.out.println(pq);
		}
	}
	
	private static void reverse(Queue<Integer> q) {
		//add
		//remove
		// isEmpty.
		Stack<Integer> stack=new Stack<Integer>();
		while(!q.isEmpty()) {
			stack.push(q.remove());
		}
		
		while(!stack.isEmpty()) {
			q.add(stack.pop());
		}
	}
}
