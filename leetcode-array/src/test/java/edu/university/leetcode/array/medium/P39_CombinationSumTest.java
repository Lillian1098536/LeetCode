package edu.university.leetcode.array.medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class P39_CombinationSumTest {

    @Test
    public void combinationSum() throws Exception {
        int[] candidates = {2,3,6,7};
        List<List<Integer>> result = P39_CombinationSum.combinationSum(candidates, 7);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 2, 3));
        expected.add(Arrays.asList(7));
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                assertEquals(result.get(i).get(j), expected.get(i).get(j));
            }
        }
    }

}