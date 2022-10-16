package com.learning.arrays.sortedarray;

/**
 * Given a sorted array that can contain duplicates, find the first occurrence
 * of the target element. For example: A = [1,3,4,6,6,6,7] and Target = 6,
 * return index 3.
 *
 */
public class BinarySearchWitgDuplicates {

	public static void main(String[] args) {
		int[] arr= {1,3,4,6,6,6,7};
		int target=6;
		int findFirstOccurrence = findFirstOccurrence(arr, target);
		System.out.println(findFirstOccurrence);
		
	}
	
	/**
	 * Time Complexity: O(n)
	 * Space Complexity: O(1) 
	 */
	private static int findFirstOccurrence(int[] arr, int target) {
		int boundaryIndex=-1;
		int low=0;
		int high=arr.length;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]>=target) {
				boundaryIndex=mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return boundaryIndex;
	}

}
