package edu.university.leetcode.array.medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class P90_SubsetsIITest {

    P90_SubsetsII test = new P90_SubsetsII();

    @Test
    public void subsetsWithDup() {
        List<List<Integer>> expected = Arrays.asList(
                new ArrayList<>(),
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(1, 2),
                Arrays.asList(2, 2),
                Arrays.asList(1, 2, 2)
        );
        assertEquals(expected, test.subsetsWithDup(new int[] {1, 2, 2}));
    }
}