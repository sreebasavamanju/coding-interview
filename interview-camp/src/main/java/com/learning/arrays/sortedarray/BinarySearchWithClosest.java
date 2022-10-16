package com.learning.arrays.sortedarray;

/**
 * 
 * Given a sorted array of Integers, find the target. If the target is not
 * found, return the element closest to the target. For example, A =
 * [1,2,4,5,7,8,9], Target = 6 -> Output Index = 3 or 4 (since both 5 and 7 are
 * equally close)
 *
 */
public class BinarySearchWithClosest {

	public static void main(String[] args) {
		int[] arr= {1,2,4,5,7,8,9};
		int target=6;
		int binarySearch = binarySearch(arr, target);
		System.out.println(binarySearch);
	}

	/** 
	 *  Space Complexity: O(logn)
	 *  Time Complexity: O(1)
	 */
	private static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int index = -1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			index = record(mid, index, arr, target);
			if (arr[mid] > target) {
				high = mid - 1;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return index;
	}

	private static int record(int mid, int index, int[] arr, int target) {
		if (index == -1) {
			return mid;
		}

		if (Math.abs(arr[index] - target) > Math.abs(arr[mid] - target)) {
			return mid;
		}
		return index;
	}
}
