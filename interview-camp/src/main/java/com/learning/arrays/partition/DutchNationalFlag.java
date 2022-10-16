package com.learning.arrays.partition;

import java.util.Arrays;

/**
 * You are given an array of integers and a pivot. Rearrange the array in the
 * following order: [all elements less than pivot, elements equal to pivot,
 * elements greater than pivot] For example, a = [5,2,4,4,6,4,4,3] and pivot = 4
 * --> result = [3,2,4,4,4,4,5,6].
 */
public class DutchNationalFlag {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 4, 4, 6, 4, 4, 3 };
		int pivot = 4;
		threeWayPartition(arr, pivot);
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * Time Complexity: O(n) Space Complexity: O(1)
	 */
	private static void threeWayPartition(int[] arr, int pivot) {
		int high = arr.length - 1;
		int low = 0;
		int i = 0;
		while (i <= high) {
			if (arr[i] > pivot) {
				swap(arr, i, high);
				high--;
			} else if (arr[i] < pivot) {
				swap(arr, i, low);
				i++;
				low++;
			} else {
				i++;
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
