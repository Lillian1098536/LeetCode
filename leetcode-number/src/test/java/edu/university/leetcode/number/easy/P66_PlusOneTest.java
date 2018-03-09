package edu.university.leetcode.number.easy;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertTrue;

public class P66_PlusOneTest {

    @Test
    public void plusOne1() throws Exception {
        int[] digits = new int[] {1, 5, 6, 9};
        int[] expected = new int[] {1, 5, 7, 0};
        int[] result = P66_PlusOne.plusOne(digits);
        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    public void plusOne2() throws Exception {
        int[] digits = {9, 6, 5, 1};
        int[] expected = {9, 6, 5, 2};
        int[] result = P66_PlusOne.plusOne(digits);
        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    public void plusOne3() throws Exception {
        int[] digits = {9, 9, 9, 9};
        int[] expected = {1, 0, 0, 0, 0};
        int[] result = P66_PlusOne.plusOne(digits);
        assertTrue(Arrays.equals(expected, result));
    }

    @Test
    public void plusOne4() throws Exception {
        int[] digits = {0};
        int[] expected = {1};
        int[] result = P66_PlusOne.plusOne(digits);
        assertTrue(Arrays.equals(expected, result));
    }

}