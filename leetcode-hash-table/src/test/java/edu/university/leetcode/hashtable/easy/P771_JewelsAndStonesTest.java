package edu.university.leetcode.hashtable.easy;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class P771_JewelsAndStonesTest {
    P771_JewelsAndStones test = new P771_JewelsAndStones();
    @Test
    public void numJewelsInStones() {
        assertEquals(3, test.numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(0, test.numJewelsInStones("z", "ZZ"));
    }
}