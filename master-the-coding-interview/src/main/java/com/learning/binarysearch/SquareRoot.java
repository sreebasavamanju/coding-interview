package com.learning.binarysearch;

/**
 * 
 * Given an integer, find its square root without using the built-in square root
 * function. Only return the integer part (truncate the decimals).
 * 
 * Input: 16
 * 
 * Output: 4
 * 
 * Input: 8
 * 
 * Output: 2
 * 
 * Explanation: square root of 8 is 2.83..., return integer part 2
 *
 */
public class SquareRoot {

	public static void main(String[] args) {
		System.out.println(squareRoot(4));
		System.out.println(squareRoot(16));
		System.out.println(squareRoot(8));
	}
	
	
	/**
	 *  Time Complexity: O(logn) Space Complexity: O(1)
	 */
	private static int squareRoot(int n) {
		if(n==0) {
			return 0;
		}
		int low=1;
		int high=n;
		int result=-1;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(mid<=n/mid) {
				result=mid;
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		
		return result;
	}
}
