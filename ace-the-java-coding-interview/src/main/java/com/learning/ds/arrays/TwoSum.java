package com.learning.ds.arrays;

import java.util.Arrays;
import java.util.HashSet;

/*
 * In this problem, you have to implement the int[] findSum(int[] arr, int n) method,
 * which will take a number n, and an array arr as input and returns an array of two integers
 * that add up to n in an array. You are required to return only one such pair.
 * If no such pair is found then simply return the array.
 */
public class TwoSum {

  public static void main(String[] args) {
    int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
    int value = 27;
    System.out.println(Arrays.toString(twoSumEfficient(arr, value)));
    System.out.println(Arrays.toString(twoSum(arr, value)));
  }

  /*
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  private static int[] twoSumEfficient(int[] arr, int n) {
    HashSet<Integer> set = new HashSet<Integer>();
    for (int i : arr) {
      if (set.contains(i)) {
        return new int[] {n - i, i};
      } else {
        set.add(n - i);
      }
    }
    return null;
  }

  /*
   * Time Complexity: O(nlogn)
   * Space Complexity: O(1)
   */
  private static int[] twoSum(int[] arr, int n) {
    Arrays.sort(arr);
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int sum = arr[low] + arr[high];
      if (sum == n) {
        return new int[] {arr[high], arr[low]};
      } else if (sum > n) {
        high--;
      } else {
        low++;
      }
    }
    return null;
  }
}
