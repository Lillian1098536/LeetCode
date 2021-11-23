package edu.university.leetcode.array.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 179. Largest Number
 * Given a list of non-negative integers nums, arrange them such that they form the largest number.
 * Note: The result may be very large, so you need to return a string instead of an integer.
 * Example 1: Input: nums = [10,2] Output: "210"
 * Example 2: Input: nums = [3,30,34,5,9] Output: "9534330"
 * Example 3: Input: nums = [1] Output: "1"
 * Example 4: Input: nums = [10] Output: "10"
 * Constraints:
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 109
 */
public class P179_LargestNumber {
    public String largestNumber(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return String.valueOf(nums[0]);
        }
        List<String> list = new ArrayList<>();
        for (int n : nums) {
            list.add(String.valueOf(n));
        }
        Collections.sort(list, (a, b) -> {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            String order1 = sb1.append(a).append(b).toString();
            String order2 = sb2.append(b).append(a).toString();
            return order2.compareTo(order1);
        });
        if ("0".equals(list.get(len - 1))) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(list.get(i));
        }
        return  sb.toString();
    }
}
