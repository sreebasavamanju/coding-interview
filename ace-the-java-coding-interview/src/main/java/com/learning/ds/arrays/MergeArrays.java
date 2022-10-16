package com.learning.ds.arrays;

import java.util.Arrays;

/*
 * In this problem, given two sorted arrays,
 * you have to implement the int[] mergeArrays(int[] arr1, int[] arr2) method, 
 * which returns an array consisting of all elements of both arrays in a sorted way.
 */
public class MergeArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 4, 5 };
		int[] arr2 = { 2, 6, 7, 8 };
		int[] result = mergeArrays(arr1, arr2);
		System.out.println(Arrays.toString(result));
	}

	/*
	 * Time Complexity: O(n+m)  n=arr1 size , m=arr2 size
	 * Space Complexity: O(n+m)
	 */
	private static int[] mergeArrays(int[] arr1, int[] arr2) {
		int i = 0, j = 0, k = 0;
		int result[] = new int[arr1.length + arr2.length];

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				result[k] = arr1[i];
				i++;
			} else {
				result[k] = arr2[j];
				j++;
			}
			k++;
		}

		while (i < arr1.length) {
			result[k] = arr1[i];
			i++;
			k++;
		}

		while (j < arr2.length) {
			result[k] = arr2[j];
			j++;
			k++;
		}

		return result;
	}

}
