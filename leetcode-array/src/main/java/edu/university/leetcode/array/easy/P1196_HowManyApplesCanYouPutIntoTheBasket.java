package edu.university.leetcode.array.easy;

import java.util.Arrays;

/**
 * 1196. How Many Apples Can You Put into the Basket
 * You have some apples, where arr[i] is the weight of the i-th apple.  You also have a basket that can carry up to 5000 units of weight.
 * Return the maximum number of apples you can put in the basket.
 * Example 1: Input: arr = [100,200,150,1000] Output: 4
 * Explanation: All 4 apples can be carried by the basket since their sum of weights is 1450.
 * Example 2: Input: arr = [900,950,800,1000,700,800] Output: 5
 * Explanation: The sum of weights of the 6 apples exceeds 5000 so we choose any 5 of them.
 * Constraints:
 * 1.1 <= arr.length <= 10^3
 * 2.1 <= arr[i] <= 10^3
 */
public class P1196_HowManyApplesCanYouPutIntoTheBasket {
    public int maxNumberOfApples(int[] nums) {
        int sum = 0, i = nums.length - 1;
        for (int n : nums) {
            sum += n;
        }
        Arrays.sort(nums);
        while (sum >= 5000) {
            sum -= nums[i--];
        }
        return i + 1;
    }
}
