package edu.university.leetcode.hashtable.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P2325_DecodeMessageTest {
    P2325_DecodeMessage test = new P2325_DecodeMessage();
    @Test
    public void decodeMessage() {
        assertEquals("this is a secret", test.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
        assertEquals("the five boxing wizards jump quickly", test.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }
}