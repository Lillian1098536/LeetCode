package edu.university.leetcode.list.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 * Example: Input: [4,3,2,7,8,2,3,1] Output: [5,6]
 */
@Slf4j
public class P448_FindAllNumbersDisappearedInAnArray {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                int num = nums[i];
                nums[i] = 0;
                do {
                    int next = nums[num - 1];
                    nums[num - 1] = num;
                    num = next;
                } while (num != 0 && nums[num - 1] != num);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result.add(i + 1);
            }
        }
        return result;
    }

}
