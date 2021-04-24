package edu.university.leetcode.tree.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P81_SearchInRotatedSortedArrayIITest {
    P81_SearchInRotatedSortedArrayII test = new P81_SearchInRotatedSortedArrayII();
    @Test
    public void search() {
        assertTrue(test.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0));
        assertFalse(test.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3));
    }
}