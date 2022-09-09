package edu.university.leetcode.hashtable.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P395_LongestSubstringWithAtLeastKRepeatingCharactersTest {
    P395_LongestSubstringWithAtLeastKRepeatingCharacters test = new P395_LongestSubstringWithAtLeastKRepeatingCharacters();
    @Test
    public void longestSubstring() {
        assertEquals(3, test.longestSubstring("aaabb", 3));
        assertEquals(5, test.longestSubstring("ababb", 2));
        assertEquals(0, test.longestSubstring("ababbc", 3));
    }
}