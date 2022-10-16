package com.learning.arrays.traversefrombothends;

import java.util.Arrays;

/**
 * 
 * Given an array, reverse the order of its elements. For example,
 * [3,5,2,5,2,3,9] → [9,3,2,5,2,5,3]
 *
 */
public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr= {3,5,2,5,2,3,9,10};
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * Time Complexity: O(n)
	 * Space Complexity : O(1)
	 */
	private static void reverse(int[] arr) {
		if(arr==null || arr.length==0) {
			return;
		}
		
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
	}

	private static void swap(int[] arr, int start, int end) {
		int tmp=arr[start];
		arr[start]=arr[end];
		arr[end]=tmp;
	}
}
