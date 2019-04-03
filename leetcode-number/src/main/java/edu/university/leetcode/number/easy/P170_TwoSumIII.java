package edu.university.leetcode.number.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 170. Two Sum III - Data structure design
 * Design and implement a TwoSum class. It should support the following operations: add and find.
 * add - Add the number to an internal data structure.
 * find - Find if there exists any pair of numbers which sum is equal to the value.
 * For example:
 * add(1); add(3); add(5);
 * find(4) -> true
 * find(7) -> false
 */
public class P170_TwoSumIII {

    Map<Integer, Integer> map = new HashMap<>();
    Set<Integer> set = new HashSet<>();

    public void add(int number) {
        if (!map.containsKey(number)) {
            map.put(number, 1);
        } else {
            map.put(number, map.get(number) + 1);
        }
    }

    public boolean find(int value) {
        if (set.contains(value)) {
            return true;
        }
        for (int n : map.keySet()) {
            int remain = value - n;
            if (map.containsKey(remain) && (remain == n || map.get(remain) > 1) || remain != n) {
                set.add(value);
                return true;
            }
        }
        return false;
    }
}
