package com.learning;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Given an array and a number "n", find two numbers from the array that sums up to "n"
 */
public class TwoSum {
  public static void main(String[] args) {
    int[] arr={1, 21, 3, 14, 5, 60, 7, 6};
    int target=27;
    int[] sum = findSum(arr, target);
    System.out.println(Arrays.toString(sum));
  }

  /**
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  private static int[] findSum(int[] arr, int n){
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<arr.length;i++){
      if(set.contains(arr[i])){
        return new int[] {n-arr[i] ,arr[i]};
      }else{
        set.add(n-arr[i]);
      }
    }
    return null;
  }
}
