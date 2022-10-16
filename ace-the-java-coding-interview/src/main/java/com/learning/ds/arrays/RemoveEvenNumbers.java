package com.learning.ds.arrays;

import java.util.Arrays;

/*
 * In this problem, you have to implement the int [] removeEven(int[] arr) method, 
 * which removes all the even elements from the array and returns back updated array.
 */
public class RemoveEvenNumbers {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 10, 6, 3 };
		int[] oddNumbers = removeEven(arr);
		System.out.println(Arrays.toString(oddNumbers));

	}

	/*
	 * Time Complexity: O(n) Space Complexity: O(k) -> k no of odd elemets.
	 */
	private static int[] removeEven(int[] arr) {
		int oddCount = 0;
		for (int i : arr) {
			if (i % 2 != 0) {
				oddCount++;
			}
		}
		int oddNumbers[] = new int[oddCount];
		int index = 0;
		for (int i : arr) {
			if (i % 2 != 0) {
				oddNumbers[index] = i;
				index++;
			}
		}

		return oddNumbers;
	}
}
