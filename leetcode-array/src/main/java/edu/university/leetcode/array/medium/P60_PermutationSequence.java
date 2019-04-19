package edu.university.leetcode.array.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 60. Permutation Sequence
 * The set [1,2,3,...,n] contains a total of n! unique permutations.
 * By listing and labeling all of the permutations in order, we get the following sequence for n = 3:
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * Given n and k, return the kth permutation sequence.
 * Note:
 * Given n will be between 1 and 9 inclusive.
 * Given k will be between 1 and n! inclusive.
 * Example 1: Input: n = 3, k = 3 Output: "213"
 * Example 2: Input: n = 4, k = 9 Output: "2314"
 */
@Slf4j
public class P60_PermutationSequence {

    public static String getPermutation(int n, int k) {
        int total = 1;
        List<Integer> tmp = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            total *= i;
            tmp.add(i);
        }
        find(tmp, sb, total, k);
        return sb.toString();
    }

    private static void find(List<Integer> tmp, StringBuilder sb, int total, int k) {
        log.info("tmp = {}", tmp);
        log.info("total = {} k = {}", total, k);
        int n = tmp.size();
        if (n == 1) {
            sb.append(tmp.get(0));
            return;
        }
        int index = (k * n - 1) / total;
        int t = tmp.remove(index);
        log.info("index = {} t = {}");
        sb.append(t);
        log.info("sb = {}", sb.toString());
        find(tmp, sb, total / n, k - total / n * index);
    }


}
