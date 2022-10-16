package com.learning.dsa.linear.queue;

import java.util.Arrays;

import javax.print.attribute.standard.Sides;

public class ArrayQueue {

	int front=0;
	int rear=0;
	int count=0;
	int[] items;
	public ArrayQueue(int size) {
		items=new int[size];
	}
	// enqueue
	// dequeue
	// peek
	// isEmpty
	// isFull
	public void enqueue(int item) {
		if(isFull()) {
			throw new IllegalStateException();
		}
		items[rear]=item;
		rear=(rear+1)%items.length;
		count++;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new IllegalStateException();
		}
		int item=items[front];
		items[front]=0;
		front=(front+1)%items.length;
		count--;
		return item;
	
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new IllegalStateException();
		}
		return items[front];
	}
	
	public boolean isEmpty() {
		return count==0;
	}
	
	public boolean isFull() {
		return count==items.length;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(items);
	}
	
}
