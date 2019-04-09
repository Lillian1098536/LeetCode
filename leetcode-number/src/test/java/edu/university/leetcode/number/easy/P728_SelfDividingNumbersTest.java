package edu.university.leetcode.number.easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class P728_SelfDividingNumbersTest {

    @Test
    public void selfDividingNumbers() {
        List<Integer> result = P728_SelfDividingNumbers.selfDividingNumbers(1, 22);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 21, 22);
        assertEquals(result.size(), expected.size());
        for (int i = 0; i < result.size(); i++) {
            assertEquals(result.get(i), expected.get(i));
        }
    }
}