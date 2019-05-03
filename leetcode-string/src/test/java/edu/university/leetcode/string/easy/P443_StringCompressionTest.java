package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P443_StringCompressionTest {

    @Test
    public void compress1() {
        assertEquals(6, P443_StringCompression.compress(new char[]{'a', 'a','a', 'b', 'b', 'c', 'c', 'c'}));
    }

    @Test
    public void compress2() {
        assertEquals(3, P443_StringCompression.compress(new char[]{'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'}));
    }
}