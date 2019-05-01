package edu.university.leetcode.list.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class P4P448_FindAllNumbersDisappearedInAnArrayTest {

    @Test
    public void findDisappearedNumbers() {
        List<Integer> expected = new ArrayList<>();
        List<Integer> result = P448_FindAllNumbersDisappearedInAnArray.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        expected.addAll(Arrays.asList(5, 6));
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), result.get(i));
        }
    }
}