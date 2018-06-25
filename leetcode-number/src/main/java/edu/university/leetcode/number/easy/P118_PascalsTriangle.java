package edu.university.leetcode.number.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 * Given numRows, generate the first numRows of Pascal's triangle.
 * For example, given numRows = 5,
 * Return
 * [
 *   [1],
 *   [1,1],
 *   [1,2,1],
 *   [1,3,3,1],
 *   [1,4,6,4,1]
 * ]
 */
@Slf4j
public class P118_PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows <= 0) {
            return list;
        }
        List<Integer> level = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            level.add(1);
            for (int j = level.size() - 2; j > 0; j--) {
                log.info("i = {} j = {} level.get(j) = {} level.get(j - 1) = {}", i, j, level.get(j), level.get(j - 1));
                level.set(j, level.get(j) + level.get(j - 1));
            }
            list.add(new ArrayList<>(level));
        }
        return list;
    }

}
