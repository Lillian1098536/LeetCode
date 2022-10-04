package edu.university.leetcode.array.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P915_PartitionArrayIntoDisjointIntervalsTest {
    P915_PartitionArrayIntoDisjointIntervals test = new P915_PartitionArrayIntoDisjointIntervals();

    @Test
    public void partitionDisjoint() {
        assertEquals(3, test.partitionDisjoint(new int[]{5, 0, 3, 8, 6}));
        assertEquals(4, test.partitionDisjoint(new int[]{1, 1, 1, 0, 6, 12}));
    }
}