package edu.university.leetcode.number.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 119. Pascal's Triangle II
 * Given an index k, return the kth row of the Pascal's triangle.
 * For example, given k = 3,
 * Return [1,3,3,1].
 * Note: Could you optimize your algorithm to use only O(k) extra space?
 */
public class P119_PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        if (rowIndex < 0) return list;
        for (int i = 0; i <= rowIndex; i++) {
            list.add(1);
            for (int j = list.size() - 2; j > 0; j--) {
                list.set(j, list.get(j) + list.get(j - 1));
            }
        }
        return list;
    }

}
