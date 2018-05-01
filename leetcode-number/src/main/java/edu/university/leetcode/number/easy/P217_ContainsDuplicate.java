package edu.university.leetcode.number.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */
public class P217_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for (int n : nums) {
            // boolean add(E e)
            // add the specified element to this set if it is not already present (optional operation)
            if (!map.add(n)) return true;
        }
        return false;
    }

}
