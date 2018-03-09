package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P58_LengthOfLastWordTest {

    @Test
    public void lengthOfLastWord1() throws Exception {
        int result = P58_LengthOfLastWord.lengthOfLastWord("Hello World");
        assertEquals(5, result);
    }

    @Test
    public void lengthOfLastWord2() throws Exception {
        int result = P58_LengthOfLastWord.lengthOfLastWord("Hello World ");
        assertEquals(5, result);
    }

}