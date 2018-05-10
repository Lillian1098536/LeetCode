package edu.university.leetcode.number.medium;

import lombok.extern.slf4j.Slf4j;

/**
 * 11. Container With Most Water
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * Note: You may not slant the container and n is at least 2.
 */
@Slf4j
public class P11_ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int len = height.length, i = 0, j = len - 1, area = 0, tmp, lh = height[0], rh = height[len - 1];
        while (i < j) {
            tmp = Math.min(lh, rh) * (j - i);
            area = tmp > area ? tmp : area;
            log.debug("i = {} j ={} tmp = {} area = {}", i, j, tmp, area);
            if (lh < rh) {
                while (i < j && height[i] <= lh) {
                    log.debug("lh < rh  height[i] ={} lh = {} rh = {}", height[i], lh, rh);
                    i++;
                }
                if (i < j) {
                    lh = height[i];
                    log.debug("                                   left h => {}", lh);
                }
            } else {
                while (i < j && height[j] <= rh) {
                    log.debug("h > rh   height[i] ={} lh = {} rh = {}", height[i], lh, rh);
                    j--;
                }
                if (i < j) {
                    rh = height[j];
                    log.debug("                                   right h => {}", rh);
                }
            }
        }
        return area;
    }

}
