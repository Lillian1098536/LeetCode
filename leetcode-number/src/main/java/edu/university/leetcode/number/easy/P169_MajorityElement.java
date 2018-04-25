package edu.university.leetcode.number.easy;

/**
 * 169. Majority Element
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class P169_MajorityElement {

    public int majorityElement(int[] nums) {
        if (nums.length < 3) return nums[0];
        int majority = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                majority = nums[i];
                ++count;
            } else if (nums[i] == majority) {
                ++count;
            } else {
                --count;
            }
        }
        return majority;
    }

}
