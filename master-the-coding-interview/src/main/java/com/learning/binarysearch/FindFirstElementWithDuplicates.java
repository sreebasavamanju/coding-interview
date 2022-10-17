package com.learning.binarysearch;

/**
 * Given a sorted array of integers and a target integer, find the first occurrence of the target
 * and return its index. Return -1 if the target is not in the array.
 *
 * <p>Input:
 *
 * <p>arr = [1, 3, 3, 3, 3, 6, 10, 10, 10, 100] target = 3
 *
 * <p>Output: 1
 *
 * <p>Explanation: First occurrence of 3 is at index 1.
 *
 * <p>Input:
 *
 * <p>arr = [2, 3, 5, 7, 11, 13, 17, 19] target = 6
 *
 * <p>Output: -1
 *
 * <p>Explanation: 6 does not exists in the array.
 */
public class FindFirstElementWithDuplicates {

  public static void main(String[] args) {
    int[] arr = {1, 3, 3, 3, 3, 6, 10, 10, 10, 100};
    int target = 3;
    int findFirstOccurrence = findFirstOccurrence(arr, target);
    System.out.println(findFirstOccurrence);

    int[] arr1 = {2, 3, 5, 7, 11, 13, 17, 19};
    int target1 = 6;
    int findFirstOccurrence1 = findFirstOccurrence(arr1, target1);
    System.out.println(findFirstOccurrence1);
  }

  /*
   *  Time Complexity: O(logn) Space Complexity: O(1)
   */
  public static int findFirstOccurrence(int[] arr, int target) {
    int boundaryIndex = -1;
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == target) {
        boundaryIndex = mid;
        high = mid - 1;
      } else if (arr[mid] > target) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return boundaryIndex;
  }
}
