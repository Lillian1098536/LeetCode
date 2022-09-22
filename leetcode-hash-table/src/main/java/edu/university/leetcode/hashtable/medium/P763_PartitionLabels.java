package edu.university.leetcode.hashtable.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 763. Partition Labels
 * You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.
 * Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.
 * Return a list of integers representing the size of these parts.
 * Example 1: Input: s = "ababcbacadefegdehijhklij" Output: [9,7,8]
 * Explanation:
 * The partition is "ababcbaca", "defegde", "hijhklij".
 * This is a partition so that each letter appears in at most one part.
 * A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
 * Example 2: Input: s = "eccbbbbdec" Output: [10]
 * Constraints:
 * 1 <= s.length <= 500
 * s consists of lowercase English letters.
 */
public class P763_PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        int[] map = new int[26];
        Arrays.fill(map, -1);
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a'] = i;
        }
        int start = 0; //partition start position
        int maxPos = 0; //scanned char max position
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int curPos = map[s.charAt(i) - 'a']; //current char's max position
            maxPos = Math.max(maxPos, curPos); //update scanned char max position
            if (i == maxPos) {
                result.add(i - start + 1);
                start = i + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        P763_PartitionLabels test = new P763_PartitionLabels();
        System.out.println("ababcbacadefegdehijhklij >>> result=" + test.partitionLabels("ababcbacadefegdehijhklij"));
        System.out.println("eccbbbbdec >>> result=" + test.partitionLabels("eccbbbbdec"));
    }
}
