package edu.university.leetcode.array.medium;

/**
 * 2012. Sum of Beauty in the Array
 * You are given a 0-indexed integer array nums. For each index i (1 <= i <= nums.length - 2) the beauty of nums[i] equals:
 * 2, if nums[j] < nums[i] < nums[k], for all 0 <= j < i and for all i < k <= nums.length - 1.
 * 1, if nums[i - 1] < nums[i] < nums[i + 1], and the previous condition is not satisfied.
 * 0, if none of the previous conditions holds.
 * Return the sum of beauty of all nums[i] where 1 <= i <= nums.length - 2.
 * Example 1: Input: nums = [1,2,3] Output: 2
 * Explanation: For each index i in the range 1 <= i <= 1:
 * - The beauty of nums[1] equals 2.
 * Example 2: Input: nums = [2,4,6,4] Output: 1
 * Explanation: For each index i in the range 1 <= i <= 2:
 * - The beauty of nums[1] equals 1.
 * - The beauty of nums[2] equals 0.
 * Example 3: Input: nums = [3,2,1] Output: 0
 * Explanation: For each index i in the range 1 <= i <= 1:
 * - The beauty of nums[1] equals 0.
 * Constraints:
 * 3 <= nums.length <= 105
 * 1 <= nums[i] <= 105
 * TimeComplex O(n)
 * SpaceComplex O(n)
 */
public class P2012_SumOfBeautyInTheArray {
    /**
     * TimeComplex O(n)
     * SpaceComplex O(n)
     */
    public int sumOfBeauties(int[] nums) {
        int n = nums[0];
        int[] dp = new int[nums.length];
        for (int i = 1, len = nums.length - 1; i < len; i++) {
            if (nums[i] > n) {
                dp[i] = 2;
            } else if (nums[i] > nums[i - 1]) {
                dp[i] = 1;
            }
            n = Math.max(n, nums[i]);
        }
        n = nums[nums.length - 1];
        for (int i = nums.length - 2; i > 0; i--) {
            if (nums[i] < n) {
                dp[i] += dp[i + 1];
            } else if (nums[i] < nums[i + 1]) {
                dp[i] = Math.min(1, dp[i]) + dp[i + 1];
            } else {
                dp[i] = dp[i + 1];
            }
            n = Math.min(n, nums[i]);
        }
        return dp[1];
    }

    public int sumOfBeauty(int[] nums) {
        int n = nums.length - 1, sum = 0, max = nums[0]; //max on left
        int[] min = new int[n + 1]; //min on right
        min[n] = nums[n];
        for (int i = n - 1; i > 1; i--) {
            min[i] = Math.min(nums[i], min[i + 1]);
        }
        for (int i = 1; i < n; i++) {
            if (nums[i] > max && nums[i] < min[i + 1]) {
                sum += 2;
            } else if (nums[i] > nums[i - 1] && nums[i] < nums[i + 1]) {
                sum += 1;
            }
            max = Math.max(nums[i], max);
        }
        return sum;
    }

    public static void main(String[] args) {
        P2012_SumOfBeautyInTheArray test = new P2012_SumOfBeautyInTheArray();
        System.out.println("2 >>> " + test.sumOfBeauty(new int[]{1, 2, 3}) + " >>> " + test.sumOfBeauties(new int[]{1, 2, 3}));
        System.out.println("1 >>> " + test.sumOfBeauty(new int[]{2, 4, 6, 4}) + " >>> " + test.sumOfBeauties(new int[]{2, 4, 6, 4}));
        System.out.println("0 >>> " + test.sumOfBeauty(new int[]{3, 2, 1}) + " >>> " + test.sumOfBeauties(new int[]{3, 2, 1}));
        System.out.println("5 >>> " + test.sumOfBeauty(new int[]{1, 2, 6, 4, 5, 7, 8}) + " >>> " + test.sumOfBeauties(new int[]{1, 2, 6, 4, 5, 7, 8}));
    }
}
