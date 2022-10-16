package com.learning.binarysearch;

/**
 * 
 * First Element Not Smaller Than Target
 * 
 * Given an array of integers sorted in increasing order and a target, find the
 * index of the first element in the array that is larger than or equal to the
 * target. Assume that it is guaranteed to find a satisfying number.
 * 
 * Input:
 * 
 * arr = [1, 3, 3, 5, 8, 8, 10] target = 2
 * 
 * Output: 1
 * 
 * Explanation: the first element larger than 2 is 3 which has index 1.
 * 
 * Input:
 * 
 * arr = [2, 3, 5, 7, 11, 13, 17, 19] target = 6
 * 
 * Output: 3
 * 
 * Explanation: the first element larger than 6 is 7 which has index 3.
 *
 */
public class FirstElementNotSmallerThanTarget {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 3, 5, 8, 8, 10 };
		int target = 2;
		int findFirst = findFirst(arr, target);
		System.out.println(findFirst);

		int[] arr1 = { 2, 3, 5, 7, 11, 13, 17, 19 };
		int target1 = 6;
		int findFirst1 = findFirst(arr1, target1);
		System.out.println(findFirst1);
	}

	/**
	 * Time Complexity: O(logn) Space Complexity: O(1) 
	 */
	private static int findFirst(int[] arr, int target) {
		int boundaryIndex = -1;
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] >= target) {
				boundaryIndex = mid;
				high = mid - 1;
				;
			} else {
				low = mid + 1;
			}
		}

		return boundaryIndex;
	}
}
