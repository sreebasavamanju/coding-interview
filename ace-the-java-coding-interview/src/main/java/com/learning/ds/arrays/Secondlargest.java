package com.learning.ds.arrays;

/**
 * In this problem, you have to implement the int findSecondMaximum(int[] arr) method, which will
 * traverse the whole array and return the second largest element present in the array.
 */
public class Secondlargest {
  public static void main(String[] args) {
    int[] arr = {9, 2, 3, 6};
    int secondMaximum = findSecondMaximum(arr);
    System.out.println(secondMaximum);
  }

  /** Time Complexity: O(n) Space Complexity: O(1) */
  private static int findSecondMaximum(int[] arr) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for (int num : arr) {

      if (num > largest) {
        secondLargest = largest;
        largest = num;
      } else if (secondLargest < num && num != largest) {
        secondLargest = num;
      }
    }
    return secondLargest;
  }
}
