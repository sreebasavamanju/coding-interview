package com.learning.binarysearch;

/**
 * 
 * A sorted array of unique integers was rotated at an unknown pivot. For
 * example, [10, 20, 30, 40, 50] becomes [30, 40, 50, 10, 20]. Find the index of
 * the minimum element in this array. All the numbers are unique.
 * 
 * Input: [30, 40, 50, 10, 20]
 * 
 * Output: 3
 * 
 * Explanation: the smallest element is 10 and its index is 3.
 * 
 * Input: [3, 5, 7, 11, 13, 17, 19, 2]
 * 
 * Output: 7
 * 
 * Explanation: the smallest element is 2 and its index is 7.
 *
 */
public class FindMinInRotaedSortedArray {

	public static void main(String[] args) {
		int[] arr = { 30, 40, 50, 10, 20 };
		System.out.println(findMin(arr));
		System.out.println(findMin(new int[] { 3, 5, 7, 11, 13, 17, 19, 2 }));
	}

	private static int findMin(int[] arr) {
		int low = 0;
		int pivot = arr[arr.length - 1];
		int high = arr.length - 1;
		int boundaryIndex = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] <= pivot) {
				boundaryIndex = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return boundaryIndex;

	}
}
