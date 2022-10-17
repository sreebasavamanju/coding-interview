package com.learning.ds.arrays;

/*
 * In this problem, you have to implement the int findMinimum(int[] arr) method,
 * which will traverse the whole array and find the smallest number in the array.
 */
public class FindMinimunValue {

  public static void main(String[] args) {
    int arr[] = {9, 2, 3, 6};
    int findMin = findMin(arr);
    System.out.println(findMin);
  }
  /*
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  private static int findMin(int[] arr) {
    int result = Integer.MAX_VALUE;
    for (int i : arr) {
      if (result > i) {
        result = i;
      }
    }
    return result;
  }
}
