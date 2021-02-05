package edu.university.leetcode.number.easy;

/**
 * 169. Majority Element
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * Example 1: Input: nums = [3,2,3] Output: 3
 * Example 2: Input: nums = [2,2,1,1,1,2,2] Output: 2
 * Constraints:
 * n == nums.length
 * 1 <= n <= 5 * 104
 * -231 <= nums[i] <= 231 - 1
 */
public class P169_MajorityElement {

    public int majorityElement(int[] nums) {
        if (nums.length < 3) return nums[0];
        int m = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                m = nums[i];
                count++;
            } else if (m == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return m;
    }

}
