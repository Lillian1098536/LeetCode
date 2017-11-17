package edu.university.leetcode.string.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P3_LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void lengthOfLongestSubstring1() throws Exception {
        int result = P3_LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abc");
        assertEquals(3, result);
    }

    @Test
    public void lengthOfLongestSubstring2() throws Exception {
        int result = P3_LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb");
        assertEquals(1, result);
    }

    @Test
    public void lengthOfLongestSubstring3() throws Exception {
        int result = P3_LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, result);
    }

    @Test
    public void lengthOfLongestSubstring4() throws Exception {
        int result = P3_LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("aab");
        assertEquals(2, result);
    }

    @Test
    public void longeseSubstringTest1() {
        int result = P3_LongestSubstringWithoutRepeatingCharacters.longeseSubstring("abc");
        assertEquals(3, result);
    }

    @Test
    public void longeseSubstringTest2() {
        int result = P3_LongestSubstringWithoutRepeatingCharacters.longeseSubstring("bbbbb");
        assertEquals(1, result);
    }

    @Test
    public void longeseSubstringTest3() {
        int result = P3_LongestSubstringWithoutRepeatingCharacters.longeseSubstring("pwwkew");
        assertEquals(3, result);
    }

    @Test
    public void longeseSubstringTest4() {
        int result = P3_LongestSubstringWithoutRepeatingCharacters.longeseSubstring("aab");
        assertEquals(2, result);
    }
}