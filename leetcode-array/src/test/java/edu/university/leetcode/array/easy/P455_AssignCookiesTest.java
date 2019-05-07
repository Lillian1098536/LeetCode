package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P455_AssignCookiesTest {

    @Test
    public void findContentChildren1() {
        assertEquals(1, P455_AssignCookies.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
    }

    @Test
    public void findContentChildren2() {
        assertEquals(2, P455_AssignCookies.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
    }

}