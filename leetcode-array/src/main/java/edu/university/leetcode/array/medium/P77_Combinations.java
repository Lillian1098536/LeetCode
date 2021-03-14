package edu.university.leetcode.array.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 77. Combinations
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * You may return the answer in any order.
 * Example 1: Input: n = 4, k = 2
 * Output:
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 * Example 2: Input: n = 1, k = 1
 * Output: [[1]]
 * Constraints:
 * 1 <= n <= 20
 * 1 <= k <= n
 */
public class P77_Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(n, k, 1, 0, list, result);
        return result;
    }

    /**
     * dfs, recursive
     * time complex O(n!) space complex O(n)
     */
    private static void dfs(int n, int k, int start, int cur, List<Integer> list, List<List<Integer>> result) {
        if (cur == k) {
            result.add(new ArrayList<>(list));
        }
        for (int i = start; i <= n; i++) {
            list.add(i);
            dfs(n, k, i + 1, cur + 1, list, result);
            list.remove(list.size() - 1);
        }
    }

    /**
     * dfs, recursive
     */
    public List<List<Integer>> combination(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, new LinkedList<>(), 1, n, k);
        return result;
    }

    private static void dfs(List<List<Integer>> result, LinkedList<Integer> list, int current, int n, int k) {
        if (k <= 0) {
            result.add(new LinkedList<>(list));
            return;
        }
        for (int i = current, end = n - k + 1; i <= end; i++) {
            list.add(i);
            dfs(result, list, i + 1, n, k - 1);
            list.removeLast();
        }
    }
}
