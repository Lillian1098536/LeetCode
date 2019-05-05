package edu.university.leetcode.array.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * 447. Number of Boomerangs
 * Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k)
 * such that the distance between i and j equals the distance between i and k (the order of the tuple matters).
 * Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).
 * Example: Input: [[0,0],[1,0],[2,0]] Output: 2
 * Explanation:
 * The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
 */
@Slf4j
public class P447_NumberOfBoomerangs {

    public static int numberOfBoomerangs(int[][] points) {
        int result = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Integer, Integer> distances = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                int distance = getDistance(points[i], points[j]);
                distances.put(distance, distances.getOrDefault(distance, 0) + 1);
                log.info("distance = {} distances = {}", distance, distances);
            }
            for (int value : distances.values()) {
                log.info("value = {}", value);
                result += value * (value - 1);
                log.info("result = {}", result);
            }
        }
        return result;
    }

    private static int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        return dx * dx + dy * dy;
    }

}
