package edu.university.leetcode.stack.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P71_SimplifyPathTest {
    P71_SimplifyPath test = new P71_SimplifyPath();
    @Test
    public void simplifyPath() {
        assertEquals("/home", test.simplifyPath("/home/"));
        assertEquals("/", test.simplifyPath("/../"));
        assertEquals("/home/foo", test.simplifyPath("/home//foo/"));
    }
}