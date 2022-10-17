package com.learning.binarysearch;

/**
 * A mountain array is defined as an array that
 *
 * <p>has at least 3 elements has an element with the largest value called "peak", with index k. The
 * array elements monotonically increase from the first element to A[k], and then monotonically
 * decreases from A[k + 1] to the last element of the array. Thus creating a "mountain" of numbers.
 *
 * <p>That is, given A[0]<...<A[k-1]<A[k]>A[k+1]>...>A[n-1], we need to find the index k. Note that
 * the peak element is neither the first nor the last element of the array.
 *
 * <p>Find the index of the peak element. Assume there is only one peak element.
 *
 * <p>Input: 0 1 2 3 2 1 0
 *
 * <p>Output: 3
 *
 * <p>Explanation: the largest element is 3 and its index is 3.
 */
public class PeakOfMountainArray {

  public static void main(String[] args) {
    int[] arr = {0, 1, 2, 3, 2, 1, 0, 2, 4, 5, 6, 8, 6, 4, 3, 1, 0};
    int binarySearch = findPeak(arr);
    System.out.println(arr[binarySearch]);
  }

  private static int findPeak(int[] arr) {

    int low = 0;
    int high = arr.length - 1;
    int boundaryindex = -1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] > arr[mid + 1]) {
        if (boundaryindex > -1 && arr[boundaryindex] > arr[mid]) {
          boundaryindex = mid;
        } else {
          boundaryindex = mid;
        }
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return boundaryindex;
  }
}
