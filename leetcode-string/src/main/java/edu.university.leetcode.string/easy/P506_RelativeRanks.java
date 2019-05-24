package edu.university.leetcode.string.easy;

/**
 * 506. Relative Ranks
 * Given scores of N athletes, find their relative ranks and the people with the top three highest scores,
 * who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
 * Example 1: Input: [5, 4, 3, 2, 1] Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 * Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
 * For the left two athletes, you just need to output their relative ranks according to their scores.
 * Note:
 * N is a positive integer and won't exceed 10,000.
 * All the scores of athletes are guaranteed to be unique.
 */
public class P506_RelativeRanks {

    public static String[] findRelativeRanks(int[] nums) {
        int max = -1, rank = 1;
        for (int n : nums) {
            if (n > max) max = n;
        }
        int[] map = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            map[nums[i]] = i + 1;
        }
        String[] result = new String[nums.length];
        for (int i = max; i > -1; i--) {
            int index = map[i];
            if (index > 0) {
                String s = "";
                if (rank == 1) {
                    s = "Gold Medal";
                } else if (rank == 2) {
                    s = "Silver Medal";
                } else if (rank == 3) {
                    s = "Bronze Medal";
                } else {
                    s = String.valueOf(rank);
                }
                result[index - 1] = s;
                rank++;
            }
        }
        return result;
    }

}
