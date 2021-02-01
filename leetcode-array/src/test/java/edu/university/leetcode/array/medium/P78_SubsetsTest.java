package edu.university.leetcode.array.medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class P78_SubsetsTest {

    P78_Subsets test = new P78_Subsets();
    @Test
    public void subsets() {
        List<List<Integer>> expected = Arrays.asList(
                new ArrayList<>(),
                Arrays.asList(3),
                Arrays.asList(2),
                Arrays.asList(2, 3),
                Arrays.asList(1),
                Arrays.asList(1, 3),
                Arrays.asList(1, 2),
                Arrays.asList(1, 2, 3)
                );
        assertEquals(expected, test.subsets(new int[] {1, 2, 3}));
    }
}