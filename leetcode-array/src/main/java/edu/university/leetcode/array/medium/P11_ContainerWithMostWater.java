package edu.university.leetcode.array.medium;

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
    //greedy + double pointers
    public int maxArea(int[] height) {
        int l = 0, r = height.length -1, area = 0;
        while (l < r) {
            area = height[l] < height[r] ?
                    //     area length * moving left pointer to higher height
                    Math.max(area, (r - l) * height[l++]) :
                    //     area length * moving right pointer to higher height
                    Math.max(area, (r - l) * height[r--]);
        }
        return area;
    }

}
