package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P387_FirstUniqueCharacterInAStringTest {
    @Test
    public void firstUniqChar1() throws Exception {
        int result = P387_FirstUniqueCharacterInAString.firstUniqChar("leetcode");
        assertEquals(0, result);
    }

    @Test
    public void firstUniqChar2() throws Exception {
        int result = P387_FirstUniqueCharacterInAString.firstUniqChar("loveleetcode");
        assertEquals(2, result);
    }

    @Test
    public void firstUniqChar3() throws Exception {
        int result = P387_FirstUniqueCharacterInAString.firstUniqCharacter("leetcode");
        assertEquals(0, result);
    }

    @Test
    public void firstUniqChar4() throws Exception {
        int result = P387_FirstUniqueCharacterInAString.firstUniqCharacter("loveleetcode");
        assertEquals(2, result);
    }
}