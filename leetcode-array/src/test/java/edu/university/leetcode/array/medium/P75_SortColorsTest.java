package edu.university.leetcode.array.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P75_SortColorsTest {
    @Test
    public void sortColors() throws Exception {
        int[] test = new int[]{2, 0, 2, 1, 1, 0};
        int[] expected = new int[]{0, 0, 1, 1, 2, 2};
        P75_SortColors.sortColors(test);
        for (int i = 0; i < test.length; i++) {
            assertEquals(test[i], expected[i]);
        }
    }

}