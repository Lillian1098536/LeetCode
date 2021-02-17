package edu.university.leetcode.dynamicprogramming.hard;

/**
 * 45. Jump Game II
 * Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 * Your goal is to reach the last index in the minimum number of jumps.
 * You can assume that you can always reach the last index.
 * Example 1: Input: nums = [2,3,1,1,4] Output: 2
 * Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Example 2: Input: nums = [2,3,0,1,4] Output: 2
 * Constraints:
 * 1 <= nums.length <= 3 * 104
 * 0 <= nums[i] <= 105
 */
public class P45_JumpGameII {

    /**
     * time complex O(n) space complex O(1)
     */
    public int jump(int[] nums) {
        int step = 0, left = 0, right = 0;
        if (nums.length == 1) return 0;
        while (left <= right) {
            System.out.println("step = " + step);
            System.out.println("left = " + left);
            System.out.println("right(ordRight) = " + right);
            step++;
            final int ordRight = right;
            for (int i = left; i <= ordRight; i++) {
                int newRight = i + nums[i];
                System.out.println("i = " + i + " newRight = " + newRight);
                if (newRight >= nums.length - 1) return step;
                if (newRight > right) right = newRight;
            }
            left = ordRight + 1;
        }
        return 0;
    }
}
