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

}