package edu.university.leetcode.binary.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 461. Hamming Distance
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 * Note: 0 ≤ x, y < 231.
 * Example: Input: x = 1, y = 4 Output: 2
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑

 The above arrows point to positions where the corresponding bits are different.
 */
@Slf4j
public class P461_HammingDistance {

    public static int hammingDistance(int x, int y) {
        int count = 0, diff = x ^ y;
        while (diff > 0) {
            log.info("count = {} diff = {}", count, diff);
                count += diff & 1;
                diff >>>= 1;
        }
        return count;
    }

}
