package edu.university.leetcode.string.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P151_ReverseWordsInAStringTest {
    @Test
    public void reverseWords1() throws Exception {
        String result = P151_ReverseWordsInAString.reverseWords("the sky is blue");
        assertEquals("blue is sky the", result);
    }

    @Test
    public void reverseWords2() throws Exception {
        String result = P151_ReverseWordsInAString.reverseWords2("a b");
        assertEquals("b a", result);
    }

}