package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P500_KeyboardRowTest {

    @Test
    public void findWords() {
        P500_KeyboardRow test = new P500_KeyboardRow();
        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        String[] expected = new String[]{"Alaska", "Dad"};
        String[] result = test.findWords(words);
        assertArrayEquals("Keyboard Row", expected, result);
    }

}