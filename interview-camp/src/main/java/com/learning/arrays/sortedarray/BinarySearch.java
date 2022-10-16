package com.learning.arrays.sortedarray;

/**
 * Given a sorted array, search for a target item
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {0,2,3,5,7,8,10,11};
		int target=7;
		int binarySearch = binarySearch(arr, target);
		System.out.println(binarySearch);
	}
	
	/**
	 * Time Complexity: O(logn)
	 * Space Complexity: O(1) 
	 */
	private static int binarySearch(int[] arr, int target) {
		int low=0;
		int high=arr.length-1;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]>target) {
				high=mid-1;;
			}else if (arr[mid] < target) {
				low=mid+1;
			}else {
				return mid;
			}
		}
		
		return -1;
	}

}
