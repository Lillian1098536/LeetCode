package edu.university.leetcode.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P1323_Maximum69NumberTest {
    P1323_Maximum69Number test = new P1323_Maximum69Number();
    @Test
    public void maximum69Number() {
        assertEquals(9969, test.maximum69Number(9669));
        assertEquals(9969, test.max69Number(9669));
    }
}