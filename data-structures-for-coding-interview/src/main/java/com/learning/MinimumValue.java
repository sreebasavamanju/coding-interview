package com.learning;

/**
 * Given an array of size "n", can you find the minimum value in the array?
 */
public class MinimumValue {
  public static void main(String[] args) {
      int[] arr = {9, 2, 3, 6};
      int minimum = findMinimum(arr);
    System.out.println(minimum);
  }

    /**
     *  Time Complexity: O(n)
     *  Space Complexity: O(1)
     */
  private static int findMinimum(int[] arr){
      int min=Integer.MAX_VALUE;
      for(int item:arr){
          if(min>item){
              min=item;
          }
      }
      return min;
  }
}
