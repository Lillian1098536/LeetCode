package edu.university.leetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 163. Missing Ranges
 * Given a sorted integer array nums, where the range of elements are in the inclusive range [lower, upper]
 * return its missing ranges.
 * Example:
 * Input: nums = [0, 1, 3, 50, 75], lower = 0 and upper = 99,
 * Output: ["2", "4->49", "51->74", "76->99"]
 */
public class P163_MissingRanges {

    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> ranges = new ArrayList<>();
        int len = nums.length;
        if (len == 0) {
            if (lower <= upper) {
                ranges.add(getRange(lower, upper));
            }
        }
        if (lower < nums[0]) {
            ranges.add(getRange(lower, nums[0]));
        }
        for (int i = 1; i < len; i++) {
            if (nums[i] > nums[i - 1] && nums[i - 1] != nums[i] - 1) {
                ranges.add(getRange(nums[i - 1] + 1, nums[i] - 1));
            }
        }
        if (upper > nums[len - 1]) {
            ranges.add(getRange(nums[len - 1] + 1, upper));
        }
        return ranges;
    }

    private static String getRange(int lower, int upper){
        if (lower == upper) return lower + "";
        return lower + "->" + upper;
    }
}