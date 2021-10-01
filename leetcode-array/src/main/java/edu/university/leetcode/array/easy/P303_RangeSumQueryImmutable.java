package edu.university.leetcode.array.easy;

/**
 * 	303. Range Sum Query - Immutable
 * 	Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 * 	Example: Given nums = [-2, 0, 3, -5, 2, -1]
 * 	sumRange(0, 2) -> 1
 * 	sumRange(2, 5) -> -1
 * 	sumRange(0, 5) -> -3
 * 	Note:
 * 	You may assume that the array does not change.
 * 	There are many calls to sumRange function.
 */
public class P303_RangeSumQueryImmutable {

    private int[] nums;
    public P303_RangeSumQueryImmutable(int[] nums) {
        this.nums = nums;
    }
    public int sumRange(int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum +=  nums[k];
        }
        return sum;
    }

    static class NumArray {
        private int[] dp;
        public NumArray(int[] nums) {
            dp = new int[nums.length + 1];
            for (int i = 1; i <= nums.length; i++) {
                dp[i] = dp[i - 1] + nums[i - 1];
            }
        }
        public int sumRange(int i, int j) {
            return dp[j + 1] - dp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
        NumArray test = new NumArray(nums);
        System.out.println(test.sumRange(0, 1));
        System.out.println(test.sumRange(1, 2));
    }

}
