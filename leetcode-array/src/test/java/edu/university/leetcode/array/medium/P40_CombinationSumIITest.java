package edu.university.leetcode.array.medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class P40_CombinationSumIITest {

    @Test
    public void combinationSum2() {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        List<List<Integer>> result = P40_CombinationSumII.combinationSum2(candidates, 8);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 7));
        expected.add(Arrays.asList(1, 2, 5));
        expected.add(Arrays.asList(2, 6));
        expected.add(Arrays.asList(1, 1, 6));
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                assertEquals(result.get(i).get(j), expected.get(i).get(j));
            }
        }
    }
}