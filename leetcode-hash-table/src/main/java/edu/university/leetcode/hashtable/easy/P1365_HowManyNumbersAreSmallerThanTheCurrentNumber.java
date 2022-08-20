package edu.university.leetcode.hashtable.easy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

/**
 * 1365. How Many Numbers Are Smaller Than the Current Number
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is,
 * for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 * Return the answer in an array.
 * Example 1: Input: nums = [8,1,2,2,3] Output: [4,0,1,1,3]
 * Explanation:
 * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
 * For nums[1]=1 does not exist any smaller number than it.
 * For nums[2]=2 there exist one smaller number than it (1).
 * For nums[3]=2 there exist one smaller number than it (1).
 * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 * Example 2: Input: nums = [6,5,4,8] Output: [2,1,0,3]
 * Example 3: Input: nums = [7,7,7,7] Output: [0,0,0,0]
 * Constraints:
 * 2 <= nums.length <= 500
 * 0 <= nums[i] <= 100
 */
public class P1365_HowManyNumbersAreSmallerThanTheCurrentNumber {
    private static final Logger LOG = LogManager.getLogger(P1365_HowManyNumbersAreSmallerThanTheCurrentNumber.class);

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] < nums[i]) {
                    result[i]++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        P1365_HowManyNumbersAreSmallerThanTheCurrentNumber test = new P1365_HowManyNumbersAreSmallerThanTheCurrentNumber();
        System.out.println("4,0,1,1,3 >>> " + Arrays.toString(test.bucket101(new int[]{8, 1, 2, 2, 3})));
        System.out.println("2,1,0,3 >>> " + Arrays.toString(test.smallerNumbersThanCurrent(new int[]{6, 5, 4, 8})));
    }

    public int[] bucket101(int[] nums) {
        int len = nums.length;
        int[] buck = new int[101];
        for (int i = 0; i < len; i++) {
            buck[nums[i]] += 1;
            LOG.info("added 1 for buck[{}]={}", nums[i], buck[nums[i]]);
        }
        LOG.info("Get from nums  bucket={}", Arrays.toString(buck));
        for (int j = 1; j < 100; j++) {
            //when position = j, count of nums[j] smaller than position j + 1, which = position j + position j - 1
            buck[j] += buck[j - 1];
        }
        LOG.info("get length 101 bucket={}", Arrays.toString(buck));
        for (int i = 0; i < len; i++) {
            int pos = nums[i];
            LOG.info("pos={} buck[pos-1]={}", pos, buck[pos - 1]);
            nums[i] = pos == 0 ? 0 : buck[pos - 1];
        }
        return nums;
    }
}
