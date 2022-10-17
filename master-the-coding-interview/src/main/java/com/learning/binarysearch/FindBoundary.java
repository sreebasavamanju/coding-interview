package com.learning.binarysearch;

/**
 * An array of boolean values is divided into two sections; the left section consists of all false
 * and the right section consists of all true. Find the boundary of the right section, i.e. the
 * index of the first true element. If there is no true element, return -1.
 *
 * <p>Input: arr = [false, false, true, true, true]
 *
 * <p>Output: 2
 *
 * <p>Explanation: first true's index is 2.
 */
public class FindBoundary {

  public static void main(String[] args) {
    boolean[] arr = {false, false, true, true, true};
    int findBoundary = findBoundary(arr);
    System.out.println(findBoundary);
  }

  /** Time Complexity: O(logn) Space Complexity: O(1) */
  private static int findBoundary(boolean[] arr) {
    int boundaryIndex = -1;
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid]) {
        boundaryIndex = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return boundaryIndex;
  }
}
