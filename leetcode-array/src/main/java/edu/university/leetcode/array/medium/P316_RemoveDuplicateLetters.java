package edu.university.leetcode.array.medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

/**
 * 316. Remove Duplicate Letters
 * Given a string s, remove duplicate letters so that every letter appears once and only once.
 * You must make sure your result is the smallest in lexicographical order among all possible results.
 * Example 1: Input: s = "bcabc" Output: "abc"
 * Example 2: Input: s = "cbacdcbc" Output: "acdb"
 * Constraints:
 * 1 <= s.length <= 104
 * s consists of lowercase English letters.
 * Note: This question is the same as 1081: https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/
 */
public class P316_RemoveDuplicateLetters {
    private static final Logger LOG = LoggerFactory.getLogger(P316_RemoveDuplicateLetters.class);
    public String removeDuplicateLetters(String s) {
        int[] record = new int[26];
        boolean[] added = new boolean[26];
        char[] arr = s.toCharArray();
        for (char c : arr) {
            record[c - 'a']++;
            LOG.info("index={} record[{}]={}", c - 'a', c - 'a', record[c - 'a']);
        }
        LOG.info("record={}", record);
        Stack<Character> stack = new Stack<>();
        int i;
        for (char c : arr) {
            i = c - 'a';
            record[i]--;
            if (added[i]) {
                continue;
            }
            while (!stack.isEmpty() && c < stack.peek() && record[stack.peek() - 'a'] != 0) {
                LOG.info("stack peek {}", stack.peek());
                LOG.info("added={}", added);
                added[stack.pop() - 'a'] =  false;
            }
            LOG.info("record[{}]={} push {} to stack", i, record[i], c);
            stack.push(c);
            added[i] = true;
        }
        LOG.info("stack={}", stack);
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}
