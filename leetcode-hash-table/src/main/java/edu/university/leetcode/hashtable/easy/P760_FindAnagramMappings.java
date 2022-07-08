package edu.university.leetcode.hashtable.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 760. Find Anagram Mappings
 * Given two lists A and B, and B is an anagram of A. B is an anagram of A means B is made by randomizing the order of the elements in A.
 * We want to find an index mapping P, from A to B. A mapping P[i] = j means the ith element in A appears in B at index j.
 * These lists A and B may contain duplicates. If there are multiple answers, output any of them.
 * For example, given A = [12, 28, 46, 32, 50] B = [50, 12, 32, 46, 28]
 * We should return [1, 4, 3, 2, 0]
 * as P[0] = 1 because the 0th element of A appears at B[1], and P[1] = 4 because the 1st element of Aappears at B[4], and so on.
 * Note:
 * A, B have equal lengths in range [1, 100].
 * A[i], B[i] are integers in range [0, 10^5]
 */
public class P760_FindAnagramMappings {
    public int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, Integer> lookup = new HashMap<>();
        for (int i = 0; i < B.length; i++) {
            lookup.put(B[i], i);
        }
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = lookup.get(A[i]);
        }
            return result;
    }

    public static void main(String[] args) {
        P760_FindAnagramMappings test = new P760_FindAnagramMappings();
        System.out.println(Arrays.toString(test.anagramMappings(new int[]{12, 28, 46, 32, 50}, new int[]{50, 12, 32, 46, 28})));
    }
}
