package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P38_CountAndSayTest {

    @Test
    public void countAndSay1() throws Exception {
        String result = P38_CountAndSay.countAndSay(1);
        assertEquals("1", result);
    }

    @Test
    public void countAndSay2() throws Exception {
        String result = P38_CountAndSay.countAndSay(2);
        assertEquals("11", result);
    }

    @Test
    public void countAndSay3() throws Exception {
        String result = P38_CountAndSay.countAndSay(3);
        assertEquals("21", result);
    }

    @Test
    public void countAndSay4() throws Exception {
        String result = P38_CountAndSay.countAndSay(4);
        assertEquals("1211", result);
    }

    @Test
    public void countAndSay5() throws Exception {
        String result = P38_CountAndSay.countAndSay(5);
        assertEquals("111221", result);
    }

    @Test
    public void countAndSay6() throws Exception {
        String result = P38_CountAndSay.countAndSay(6);
        assertEquals("312211", result);
    }

    @Test
    public void countAndSay7() throws Exception {
        String result = P38_CountAndSay.countAndSay(7);
        assertEquals("13112221", result);
    }
}