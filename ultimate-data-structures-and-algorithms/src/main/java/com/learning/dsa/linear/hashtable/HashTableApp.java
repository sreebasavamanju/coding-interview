package com.learning.dsa.linear.hashtable;

public class HashTableApp {

	public static void main(String[] args) {
		HashTable table=new HashTable(5);
		table.put(6, "A");
		table.put(8, "B");
		table.put(11, "C");
		String string = table.get(11);
		System.out.println(string);
	}
}
