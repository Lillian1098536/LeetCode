package edu.university.leetcode.hashtable.medium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 2405. Optimal Partition of String
 * Given a string s, partition the string into one or more substrings such that the characters in each substring are unique.
 * That is, no letter appears in a single substring more than once.
 * Return the minimum number of substrings in such a partition.
 * Note that each character should belong to exactly one substring in a partition.
 * Example 1: Input: s = "abacaba" Output: 4
 * Explanation:
 * Two possible partitions are ("a","ba","cab","a") and ("ab","a","ca","ba").
 * It can be shown that 4 is the minimum number of substrings needed.
 * Example 2: Input: s = "ssssss" Output: 6
 * Explanation:
 * The only valid partition is ("s","s","s","s","s","s").
 * Constraints:
 * 1 <= s.length <= 105
 * s consists of only English lowercase letters.
 */
public class P2405_OptimalPartitionOfString {
    private final Logger LOG = LogManager.getLogger(P2405_OptimalPartitionOfString.class);
    public int partitionString(String s) {
        int result = 1;
        if (s.length() == 1) return result;
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                LOG.info("set already contains char={} set={}", c, set);
                result++;
                set.clear();
            }
            set.add(c);
        }
        return result;
    }
}
