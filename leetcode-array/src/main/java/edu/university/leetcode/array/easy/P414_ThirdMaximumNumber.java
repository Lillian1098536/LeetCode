package edu.university.leetcode.array.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.TreeSet;

/**
 * 414. Third Maximum Number
 * Given a non-empty array of integers, return the third maximum number in this array.
 * If it does not exist, return the maximum number. The time complexity must be in O(n).
 * Example 1: Input: [3, 2, 1] Output: 1 Explanation: The third maximum is 1.
 * Example 2: Input: [1, 2] Output: 2 Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 * Example 3: Input: [2, 2, 3, 1] Output: 1
 * Explanation: Note that the third maximum here means the third maximum distinct number.
 * Both numbers with value 2 are both considered as second maximum.
 */
@Slf4j
public class P414_ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int n : nums) {
            set.add(n);
            if (set.size() > 3) {
                set.remove(set.first());
            }
            log.info("n = {} set = {}", n, set);
        }
        return set.size() == 3 ? set.first() : set.last();
    }

    public static int thirdMaxNum(int[] nums) {
        long m1 = Long.MIN_VALUE, m2 = Long.MIN_VALUE, m3 = Long.MIN_VALUE;
        for (int n : nums) {
            if (n > m1) {
                m3 = m2;
                m2 = m1;
                m1 = n;
            } else if (n == m1) {
                continue;
            } else if (n < m1 && n > m2) {
                m3 = m2;
                m2 = n;
            } else if (n == m2) {
                continue;
            } else if (n < m2 &&n > m3) {
                m3 = n;
            }
            log.info("1 = {} 2 = {} 3 = {}", m1, m2, m3);
        }
        return m3 == Long.MIN_VALUE ? (int)m1 : (int)m3;
    }
}
