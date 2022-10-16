package com.learning.dsa.linear.hashtable;

import java.io.ObjectInputStream.GetField;
import java.nio.channels.IllegalSelectorException;
import java.util.LinkedList;

public class HashTable {
	// put(k,v)
	// get(k):v
	// remove(k)
	// k:int
	// v:string
	// Collisions: chaining

	private int bucketSize;

	private class Entry {
		private int key;
		private String value;

		public Entry(int key, String value) {
			this.key = key;
			this.value = value;
		}
	}

	private LinkedList<Entry>[] entries;

	public HashTable(int bucketSize) {
		this.bucketSize = bucketSize;
		entries = new LinkedList[bucketSize];
	}

	public void put(int key, String value) {
		LinkedList<Entry> bucket = getOrCreate(key);
		Entry entry = getEntry(bucket, key);
		if(entry!=null) {
			entry.value=value;
		}else {
			bucket.addLast(new Entry(key, value));
		}
	}


	public String get(int key) {
		LinkedList<Entry> bucket = getBucket(key);
		Entry entry = getEntry(bucket, key);
		return entry == null ? null : entry.value;
	}

	public void remove(int key) {
		LinkedList<Entry> bucket = getBucket(key);
		Entry entry = getEntry(bucket, key);
		if (entry == null) {
			throw new IllegalSelectorException();
		}
		bucket.remove(entry);
	}

	private int hash(int key) {
		return Math.abs(key) % bucketSize;
	}

	private Entry getEntry(LinkedList<Entry> bucket, int key) {
		if (bucket != null) {
			for (Entry entry : bucket) {
				if (entry.key == key) {
					return entry;
				}
			}
		}
		return null;
	}

	private LinkedList<Entry> getBucket(int key) {
		int index = hash(key);
		LinkedList<Entry> bucket = entries[index];
		return bucket;
	}

	private LinkedList<Entry> getOrCreate(int key) {
		int index = hash(key);
		if (entries[index] == null) {
			entries[index] = new LinkedList<Entry>();
		}

		LinkedList<Entry> bucket = entries[index];
		return bucket;
	}

}
