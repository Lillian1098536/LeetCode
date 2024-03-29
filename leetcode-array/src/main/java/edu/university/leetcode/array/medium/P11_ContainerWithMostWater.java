package edu.university.leetcode.array.medium;

import lombok.extern.slf4j.Slf4j;

/**
 * 11. Container With Most Water
 * You are given an integer array height of length n.
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 * Notice that you may not slant the container.
 * Example 1: Input: height = [1,8,6,2,5,4,8,3,7] Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
 * In this case, the max area of water (blue section) the container can contain is 49.
 * Example 2: Input: height = [1,1] Output: 1
 * Constraints:
 * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104
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
