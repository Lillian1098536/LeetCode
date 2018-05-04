package edu.university.leetcode.array.easy;

/**
 * 189. Rotate Array
 * Rotate an array of n elements to the right by k steps.
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * Note: Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Hint: Could you do it in-place with O(1) extra space?
 */
public class P189_RotateArray {

    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        rotate(nums, 0, length - 1);
        rotate(nums, 0, k - 1);
        rotate(nums, k, length - 1);
    }

    private void rotate(int[] nums, int start, int end) {
        int tmp;
        while (start < end) {
            tmp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = tmp;
        }
    }

}
