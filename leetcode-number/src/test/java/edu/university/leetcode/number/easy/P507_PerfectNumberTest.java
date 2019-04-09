package edu.university.leetcode.number.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P507_PerfectNumberTest {

    @Test
    public void checkPerfectNumberTrue() {
        assertEquals(true, P507_PerfectNumber.checkPerfectNumber(28));
    }

    @Test
    public void checkPerfectNumber() {
        assertEquals(false, P507_PerfectNumber.checkPerfectNumber(1));
    }

    @Test
    public void checkPerfectNumberNTrue() {
        assertEquals(true, P507_PerfectNumber.checkPerfectNumberN(28));
    }

    @Test
    public void checkPerfectNNumber() {
        assertEquals(false, P507_PerfectNumber.checkPerfectNumberN(1));
    }
}