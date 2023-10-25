package src.leetcode.Solution.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

  public static void main(String[] args) {
    int nums[] = { 2, 11, 15, 7 };
    int target = 9;
    int ans[] = twoSum(nums, target);
    //  nums = [2,11,15,7], target = 9
    System.out.println(Arrays.toString(ans));
    // 7,-2,-6,2
  }

  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> hmp = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (hmp.get(target - nums[i]) == null) {
        hmp.put(nums[i], i);
      } else {
        return new int[] { hmp.get(target - nums[i]), i };
      }
    }
    return new int[] { 0, 0 };
  }
}
