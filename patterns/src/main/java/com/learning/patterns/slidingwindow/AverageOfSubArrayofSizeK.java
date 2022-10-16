package com.learning.patterns.slidingwindow;

import java.util.Arrays;

/*
 * Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
 */
public class AverageOfSubArrayofSizeK {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
		int k = 5;
		double[] findAverges = findAverges(arr, k);
		System.out.println(Arrays.toString(findAverges));

	}
	/*
	 * Time Complexity: O(n)
	 * Space Complexity: O(k) -> size of n-k+1
	 */
	private static double[] findAverges(int[] arr, int k) {
		double result[] =new double[arr.length-k+1];
		double windowSum=0;
		int index=0;
		for(int i=0;i<arr.length;i++) {
			windowSum+=arr[i];
			if(i>=k-1) {
				result[index]=windowSum/k;
				windowSum-=arr[index];
				index++;
			}
		}
		return result;
	}

}
