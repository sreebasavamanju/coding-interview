package com.learning.ds.arrays;

/**
 * We are given an array of integers, nums, sorted in ascending order, and an integer value, target.
 * If the target exists in the array, return its index. If the target does not exist, then return
 * -1.
 */
public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = {1, 3, 9, 10, 12};
    int target = 9;
    int index = binarySearchIterative(arr, target);
    System.out.println(index);
    int resultIndex = binarySearchRecursive(0, arr.length - 1, arr, target);
    System.out.println(resultIndex);
  }

  /**
   * Time Complexity: O(logn)
   * Space Complexity: O(logn)
   */
  private static int binarySearchRecursive(int low, int high, int[] arr, int target) {

    int mid = low + (high - low) / 2;
    if (arr[mid] == target) {
      return mid;
    } else if (arr[mid] > target) {
      return binarySearchRecursive(0, mid - 1, arr, target);
    } else {
      return binarySearchRecursive(mid + 1, high, arr, target);
    }
  }
  /**
   * Time Complexity: O(logn)
   * Space Complexity: O()
   */
  private static int binarySearchIterative(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] > target) {
        high = mid - 1;
      } else if (nums[mid] < target) {
        low = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}
