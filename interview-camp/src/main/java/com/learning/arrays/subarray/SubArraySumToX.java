package com.learning.arrays.subarray;

import java.util.Arrays;

/**
 * 
 * Given an array of positive integers, find a subarray that sums to a given
 * number X
 *
 */
public class SubArraySumToX {

	public static void main(String[] args) {
		int[] arr= {4, 0, 11, 6, 1, 7};
		int target=8;
		int[] result=subArraySum(arr,target);
		System.err.println(Arrays.toString(result));
	}

	/**
	 * 
	 * Time Complexity: O(n)
	 * Space Complexity: O(1) 
	 */
	private static int[] subArraySum(int[] arr, int target) {
		if(arr==null ) {
			return null;
		}
		int windowSum=0;
		int index=0;
		for(int i=0;i<arr.length;i++) {
			while(windowSum<target && index<arr.length) {
				windowSum+=arr[index];
				index++;
			}
			if(windowSum==target) {
				return new int[] { i,index-1};
			}
			windowSum-=arr[i];
		}
		return null;
	}
	
}
