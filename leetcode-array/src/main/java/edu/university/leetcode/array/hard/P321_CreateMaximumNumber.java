package edu.university.leetcode.array.hard;

/**
 * 321. Create Maximum Number
 * You are given two integer arrays nums1 and nums2 of lengths m and n respectively.
 * nums1 and nums2 represent the digits of two numbers. You are also given an integer k.
 * Create the maximum number of length k <= m + n from digits of the two numbers.
 * The relative order of the digits from the same array must be preserved.
 * Return an array of the k digits representing the answer.
 * Example 1: Input: nums1 = [3,4,6,5], nums2 = [9,1,2,5,8,3], k = 5 Output: [9,8,6,5,3]
 * Example 2: Input: nums1 = [6,7], nums2 = [6,0,4], k = 5 Output: [6,7,6,0,4]
 * Example 3: Input: nums1 = [3,9], nums2 = [8,9], k = 3 Output: [9,8,9]
 * Constraints:
 * m == nums1.length
 * n == nums2.length
 * 1 <= m, n <= 500
 * 0 <= nums1[i], nums2[i] <= 9
 * 1 <= k <= m + n
 */
public class P321_CreateMaximumNumber {
    /**
     * greedy + dp
     * Time complexity: O(k * (n1+n2)^2)
     * Space complexity: O(n1+n2)
     */
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] result = new int[k];
        for (int i = Math.max(0, k - nums2.length); i <= Math.min(k, nums1.length); i++) {
            result = max(result, 0, maxNumber(maxNumber(nums1, i), maxNumber(nums2, k - i)), 0);
        }
        return result;
    }
    private int[] maxNumber(int[] nums, int k) {
        int[] result = new int[k];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            while (j > 0 && nums[i] > result[j - 1] && nums.length - i > k - j) {
                j--;
            }
            if (j < k) {
                result[j++] = nums[i];
            }
        }
        return result;
    }
    private int[] maxNumber(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int m = 0, n = 0, i = 0;
        while (m != nums1.length || n != nums2.length) {
            result[i++] = max(nums1, m, nums2, n) == nums1 ? nums1[m++] : nums2[n++];
        }
        return result;
    }
    private int[] max(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < nums1.length; i++) {
            int j = n + i - m;
            if (j >= nums2.length) {
                return nums1;
            } else if (nums1[i] < nums2[j]) {
                return nums2;
            } else if (nums1[i] > nums2[j]) {
                return nums1;
            }
        }
        return nums2;
    }
}