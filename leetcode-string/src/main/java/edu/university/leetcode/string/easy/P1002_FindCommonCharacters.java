package edu.university.leetcode.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1002. Find Common Characters
 * Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings
 * within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times,
 * you need to include that character three times in the final answer.
 * You may return the answer in any order.
 * Example 1: Input: ["bella","label","roller"] Output: ["e","l","l"]
 * Example 2: Input: ["cool","lock","cook"] Output: ["c","o"]
 * Note:
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 100
 * A[i][j] is a lowercase letter
 */
public class P1002_FindCommonCharacters {
    public static List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<>();
        int[] counts = new int[128];
        Arrays.fill(counts, Integer.MAX_VALUE);
        for (String s : A) {
            int[] letters = new int[128];
            for (char c : s.toCharArray()) {
                letters[c]++;
            }
            for (int i = 0; i < counts.length; i++) {
                counts[i] = Math.min(counts[i], letters[i]);
            }
        }
        for (int i = 0; i < counts.length; i++) {
            char c = (char)i;
            int ct = counts[i];
            while (ct-- > 0) {
                result.add(String.valueOf(c));
            }
        }
        return result;
    }

}

