package com.learning.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such
 * that they add up to target.
 */
public class TwoSum {
  private static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        return new int[] {map.get(nums[i]), i};
      } else {
        map.put(target - nums[i], i);
      }
    }
    return null;
  }

  public static void main(String[] args) {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] result = twoSum(nums, target);
    System.out.println(Arrays.toString(result));
  }
}
