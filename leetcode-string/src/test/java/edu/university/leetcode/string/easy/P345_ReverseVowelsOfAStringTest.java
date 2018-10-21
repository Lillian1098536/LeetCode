package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P345_ReverseVowelsOfAStringTest {
    @Test
    public void reverseVowels1() throws Exception {
        assertEquals("holle", P345_ReverseVowelsOfAString.reverseVowels("hello"));
    }

    @Test
    public void reverseVowels2() throws Exception {
        assertEquals("leotcede", P345_ReverseVowelsOfAString.reverseVowels("leetcode"));
    }

    @Test
    public void isVowel() throws Exception {
        assertTrue(P345_ReverseVowelsOfAString.isVowel('a'));
    }

}