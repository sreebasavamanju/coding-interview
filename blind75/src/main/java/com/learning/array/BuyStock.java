package com.learning.array;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * <p>You want to maximize your profit by choosing a single day to buy one stock and choosing a
 * different day in the future to sell that stock.
 *
 * <p>Return the maximum profit you can achieve from this transaction. If you cannot achieve any
 * profit, return 0.
 */
public class BuyStock {

  public static void main(String[] args) {
    int[] arr = {7, 1, 5, 3, 6, 4};
    System.out.println(maxProfit(arr));
    System.out.println(maxProfit(new int[] {7, 6, 4, 3, 1}));
  }

  /** Time Complexity:O(n) Space Complexity: O(1)
   *  Below Implentation is greedy approach.
   */
  private static int maxProfit(int[] arr) {
    if (arr == null || arr.length == 0) {
      return 0;
    }

    int buy = arr[0];
    int maxProfit = 0;

    for (int i = 1; i < arr.length; i++) {
      if (buy > arr[i]) {
        buy = arr[i];
      } else if (arr[i] - buy > maxProfit) {
        maxProfit = arr[i] - buy;
      }
    }
    return maxProfit;
  }
}
