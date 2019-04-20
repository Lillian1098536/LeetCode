package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1013_PartitionArrayIntoThreePartsWithEqualSumTest {

    @Test
    public void canThreePartsEqualSum1() {
        assertTrue(P1013_PartitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}));
    }

    @Test
    public void canThreePartsEqualSum2() {
        assertTrue(!P1013_PartitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum(new int[]{0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1}));
    }

    @Test
    public void canThreePartsEqualSum3() {
        assertTrue(P1013_PartitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum(new int[]{3, 3, 6, 5, -2, 2, 5, 1, -9, 4}));
    }

    @Test
    public void canThreePartsEqualSum4() {
        assertTrue(!P1013_PartitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum(new int[]{6, 1, 1, 13, -1, 0, -10, 20}));
    }
}