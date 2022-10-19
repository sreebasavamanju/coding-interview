package com.learning.ds.arrays;

public class LeastCommonNumber {
  public static void main(String[] args) {
    int arr1[]={6,7,10,25,30,64,64};
    int arr2[]={0,4,5,6,7,8};
    int arr3[]={1,6,10,14};
    int leastCommonNumber = findLeastCommonNumber(arr1, arr2, arr3);
    System.out.println(leastCommonNumber);
  }

  /**
   * Time Complexity: O(n) - n is the least array length among the input arrays.
   * Space Complexity: O(1)
   */
  private static int findLeastCommonNumber(int[] arr1, int[] arr2, int[] arr3) {
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < arr1.length && j < arr2.length && k < arr3.length) {
      if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
        return arr1[i];
      }

      if (arr1[i] <= arr2[j] && arr1[i] <= arr3[k]) {
        i++;
      } else if (arr2[j] <= arr1[k] && arr2[j] <= arr3[k]) {
        j++;
      } else if (arr3[k] <= arr1[i] && arr3[k] <= arr2[j]) {
        k++;
      }
    }
    return -1;
  }
}
