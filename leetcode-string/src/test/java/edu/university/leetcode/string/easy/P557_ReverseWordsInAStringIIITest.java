package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P557_ReverseWordsInAStringIIITest {

    P557_ReverseWordsInAStringIII test = new P557_ReverseWordsInAStringIII();

    @Test
    public void reverseWords() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", test.reverseWords("Let's take LeetCode contest"));
    }

}