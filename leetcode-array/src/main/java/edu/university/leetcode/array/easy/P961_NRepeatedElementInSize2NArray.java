package edu.university.leetcode.array.easy;

import java.util.Set;
import java.util.TreeSet;

/**
 * 961. N-Repeated Element in Size 2N Array
 * In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
 * Return the element repeated N times.
 * Example 1: Input: [1,2,3,3] Output: 3
 * Example 2: Input: [2,1,2,5,3,2] Output: 2
 * Example 3: Input: [5,1,5,2,5,3,5,4] Output: 5
 */
public class P961_NRepeatedElementInSize2NArray {

    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new TreeSet<>();
        int result = -1;
        for (int a : A) {
            if (!set.contains(a)) {
                set.add(a);
            } else {
                result = a;
            }
        }
        return result;
    }

    public int repeatedNTimes0(int[] A) {
        for (int i = 2; i < A.length; i++) {
            if (A[i] == A[i - 1] || A[i] == A[i - 2]) {
                return A[i];
            }
        }
        return A[A.length - 1];
    }

}
