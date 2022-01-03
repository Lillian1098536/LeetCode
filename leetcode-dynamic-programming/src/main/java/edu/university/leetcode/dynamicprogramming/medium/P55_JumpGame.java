package edu.university.leetcode.dynamicprogramming.medium;

/**
 * 55. Jump Game
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 * Determine if you are able to reach the last index.
 * Example 1: Input: [2,3,1,1,4] Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Example 2: Input: [3,2,1,0,4] Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum
 * jump length is 0, which makes it impossible to reach the last index.
 */
public class P55_JumpGame {

    public static boolean canJump(int[] nums) {
        int reach = nums[0];
        for (int i = 1; i < nums.length && i <= reach; i++) {
            if (i + nums[i] > reach) {
                reach = i + nums[i];
            }
        }
        return reach >= nums.length - 1 ? true : false;
    }

    public boolean canJumpGreedy(int[] nums) {
        if (nums == null) return false;
        //前n-1个元素能够跳到的最远距离
        int reach = 0;
        for (int i = 0; i <= reach; i++) {
                                    //第i个元素能够跳到的最远距离
            reach = Math.max(reach, i + nums[i]);
            //如果最远距离已经大于或等于最后一个元素的下标,则说明能跳过去
            if (reach >= nums.length - 1) {
                return true; //退出, 减少循环
            }
        }
        //最远距离k不再改变,且没有到末尾元素
        return false;
    }

}
