package edu.university.leetcode.number.medium;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Slf4j
public class P18_FourSumTest {
    @Test
    public void fourSum() throws Exception {
        int[] nums = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-2, -1, 1, 2));
        expected.add(Arrays.asList(-2, 0, 0, 2));
        expected.add(Arrays.asList(-1, 0, 0, 1));
        List<List<Integer>> result = P18_FourSum.fourSum(nums, 0);
        log.info("result = {}", result);
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                assertEquals(result.get(i).get(j), expected.get(i).get(j));
            }
        }
    }

}