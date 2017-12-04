package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P58_LengthOfLastWordTest {

    @Test
    public void lengthOfLastWord() throws Exception {
        int result = P58_LengthOfLastWord.lengthOfLastWord("Hello World");
        assertEquals(5, result);
    }

}