package com.learning.binarysearch;

/**
 * Binary Search is useful when we want to search element in sorted array/list elements.
 *
 * <p>We can use binary search whenever you make a binary decision to shrink the search range.
 */
public class VanillaBinarySearch {

  public static void main(String[] args) {
    int[] arr = {1, 3, 6, 8, 9, 10};
    int binarySearch = binarySearch(arr, 6);
    System.out.println(binarySearch);
  }

  /** Time Complexity: O(logn) Space Complexity: O(1) */
  private static int binarySearch(int[] arr, int target) {

    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] > target) {
        high = mid - 1;
        ;
      } else {
        low = mid + 1;
      }
    }

    return -1;
  }
}
