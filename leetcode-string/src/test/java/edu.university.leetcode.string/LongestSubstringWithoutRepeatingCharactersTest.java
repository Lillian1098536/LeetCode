package edu.university.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void lengthOfLongestSubstring1() throws Exception {
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abc");
        assertEquals(3, result);
    }

    @Test
    public void lengthOfLongestSubstring2() throws Exception {
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb");
        assertEquals(1, result);
    }

    @Test
    public void lengthOfLongestSubstring3() throws Exception {
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, result);
    }

    @Test
    public void lengthOfLongestSubstring4() throws Exception {
        int result = LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("aab");
        assertEquals(2, result);
    }

    @Test
    public void longeseSubstringTest1() {
        int result = LongestSubstringWithoutRepeatingCharacters.longeseSubstring("abc");
        assertEquals(3, result);
    }

    @Test
    public void longeseSubstringTest2() {
        int result = LongestSubstringWithoutRepeatingCharacters.longeseSubstring("bbbbb");
        assertEquals(1, result);
    }

    @Test
    public void longeseSubstringTest3() {
        int result = LongestSubstringWithoutRepeatingCharacters.longeseSubstring("pwwkew");
        assertEquals(3, result);
    }

    @Test
    public void longeseSubstringTest4() {
        int result = LongestSubstringWithoutRepeatingCharacters.longeseSubstring("aab");
        assertEquals(2, result);
    }
}