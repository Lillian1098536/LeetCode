package edu.university.leetcode.number.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class P118_PascalsTriangleTest {
    @Test
    public void generate() throws Exception {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));
        result.add(Arrays.asList(1, 1));
        result.add(Arrays.asList(1, 2, 1));
        result.add(Arrays.asList(1, 3, 3, 1));
        result.add(Arrays.asList(1, 4, 6, 4, 1));
        assertEquals(result, P118_PascalsTriangle.generate(5));
    }

}