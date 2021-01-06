package edu.university.leetcode.array.easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class P163_MissingRangesTest {

    @Test
    public void findMissingRanges() {
        int[] nums = new int[]{0, 1, 3, 50, 75};
        List<String> ranges = Arrays.asList("2", "4->49", "51->74", "76->99");
        assertEquals(ranges, P163_MissingRanges.findMissingRanges(nums, 0, 99) );
    }
}