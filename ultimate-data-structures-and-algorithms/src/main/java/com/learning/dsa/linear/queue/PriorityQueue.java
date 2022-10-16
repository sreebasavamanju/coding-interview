package com.learning.dsa.linear.queue;

import java.util.Arrays;

public class PriorityQueue {
	private int[] items;
	private int count=0;

	public PriorityQueue(int capaity) {
		items = new int[capaity];
	}

	public void add(int item) {
		if(isFull()) {
			throw new IllegalStateException();
		}
		int i = shitItemsToInsert(item);
		items[i]=item;
		count++;
	}

	public boolean isFull() {
		return count==items.length;
	}

	private int shitItemsToInsert(int item) {
		int i;
		for(i=count-1;i>=0;i--) {
			if(items[i]>item) {
				items[i+1]=items[i];
			}else {
				break;
			}
		}
		return i+1;
	}
	
	public int remove() {
		if(isEmpty()) {
			throw new IllegalStateException();
		}
		int item=items[--count];
		items[count]=0;
		return item;
	}

	public boolean isEmpty() {
		return count==0;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(items);
	}

}
