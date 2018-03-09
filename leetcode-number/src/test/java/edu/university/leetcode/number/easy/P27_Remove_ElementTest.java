package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P27_Remove_ElementTest {

    @Test
    public void removeElement() throws Exception {
        int[] nums = {3, 2, 2, 3};
        int result = P27_Remove_Element.removeElement(nums, 3);
        assertEquals(2, result);
    }

}