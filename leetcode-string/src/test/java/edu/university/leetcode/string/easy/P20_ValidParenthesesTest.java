package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class P20_ValidParenthesesTest {

    @Test
    public void isValid1() throws Exception {
        boolean result = P20_ValidParentheses.isValid1("()");
        assertTrue(result);
    }

    @Test
    public void isValid2() throws Exception {
        boolean result = P20_ValidParentheses.isValid1("()[]{}");
        assertTrue(result);
    }

    @Test
    public void isValid3() throws Exception {
        boolean result = P20_ValidParentheses.isValid1("(]");
        assertTrue(!result);
    }

    @Test
    public void isValid4() throws Exception {
        boolean result = P20_ValidParentheses.isValid1("([)]");
        assertTrue(!result);
    }

    @Test
    public void isValid5() throws Exception {
        boolean result = P20_ValidParentheses.isValid2("([)]");
        assertTrue(!result);
    }

    @Test
    public void isValid6() throws Exception {
        boolean result = P20_ValidParentheses.isValid2("(){}[]");
        assertTrue(result);
    }

}