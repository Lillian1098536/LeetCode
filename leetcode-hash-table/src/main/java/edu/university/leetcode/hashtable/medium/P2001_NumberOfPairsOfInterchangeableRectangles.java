package edu.university.leetcode.hashtable.medium;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.HashMap;
import java.util.Map;

/**
 * 2001. Number of Pairs of Interchangeable Rectangles
 * You are given n rectangles represented by a 0-indexed 2D integer array rectangles,
 * where rectangles[i] = [widthi, heighti] denotes the width and height of the ith rectangle.
 * Two rectangles i and j (i < j) are considered interchangeable if they have the same width-to-height ratio.
 * More formally, two rectangles are interchangeable if widthi/heighti == widthj/heightj (using decimal division, not integer division).
 * Return the number of pairs of interchangeable rectangles in rectangles.
 * Example 1: Input: rectangles = [[4,8],[3,6],[10,20],[15,30]] Output: 6
 * Explanation: The following are the interchangeable pairs of rectangles by index (0-indexed):
 * - Rectangle 0 with rectangle 1: 4/8 == 3/6.
 * - Rectangle 0 with rectangle 2: 4/8 == 10/20.
 * - Rectangle 0 with rectangle 3: 4/8 == 15/30.
 * - Rectangle 1 with rectangle 2: 3/6 == 10/20.
 * - Rectangle 1 with rectangle 3: 3/6 == 15/30.
 * - Rectangle 2 with rectangle 3: 10/20 == 15/30.
 * Example 2: Input: rectangles = [[4,5],[7,8]] Output: 0
 * Explanation: There are no interchangeable pairs of rectangles.
 * Constraints:
 * n == rectangles.length
 * 1 <= n <= 105
 * rectangles[i].length == 2
 * 1 <= widthi, heighti <= 105
 */
public class P2001_NumberOfPairsOfInterchangeableRectangles {
    private static final Logger LOG = LogManager.getLogger(P2001_NumberOfPairsOfInterchangeableRectangles.class);

    public long interchangeableRectangles(int[][] rectangles) {
        long result = 0L;
        Map<Long, Long> map = new HashMap<>();
//        final long BASE = (long)1e8;
        for (int[] r : rectangles) {
            final int w = r[0], h = r[1], d = gcd(w, h);
//            final long key = (w / d) * BASE + (h / d);
            final long key = hashCode(w / d, h / d);
            LOG.info("w={} h={} d={}", w, h, d);
            map.put(key, map.getOrDefault(key, 0L) + 1);
            LOG.info("map={}", map);
        }
        LOG.info("final ratioCount={}", map.values());
        for (var count : map.values()) {
            result += count * (count - 1) / 2;
        }
        return result;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private long hashCode(int x, int y) {
        return ((long) x << 32) ^ y;
    }
}
