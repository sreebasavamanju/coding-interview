package com.learning.ds.arrays;

/**
 * We’re given a sorted integer array, nums and an integer value, target. The array is rotated by
 * some arbitrary number. Search the target in this array. If the target does not exist then return
 * -1.
 */
public class SearchInRotatedArray {
  public static void main(String[] args) {
    int[] arr = {6, 7, 1, 2, 3, 4, 5};
    int target = 3;
    int result = binarySearch(arr, target);
    System.out.println(result);
  }

  /**
   * Time Complexity: O(logn)
   * Space Complexity: O(1)
   */
  private static int binarySearch(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == target) {
        return mid;
        // low to mid is sorted.
      } else if (arr[low] <= arr[mid]) {
        if (arr[low] <= target && target < arr[mid]) {
          high = mid - 1;
        } else {
          low = mid + 1;
        }
        // mid to high is sorted.
      } else if (arr[mid] < target && target <= arr[high]) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }
}
