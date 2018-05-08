package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P242_ValidAnagramTest {
    @Test
    public void isAnagram1() throws Exception {
        assertTrue(P242_ValidAnagram.isAnagram("anagram", "nagaram"));
    }

    @Test
    public void isAnagram2() throws Exception {
        assertTrue(!P242_ValidAnagram.isAnagram("rat", "cat"));
    }

    @Test
    public void isAnagram3() throws Exception {
        assertTrue(!P242_ValidAnagram.isAnagram("ab", "a"));
    }

    @Test
    public void isAnagram4() throws Exception {
        assertTrue(!P242_ValidAnagram.isAnagram("a", "ab"));
    }

}