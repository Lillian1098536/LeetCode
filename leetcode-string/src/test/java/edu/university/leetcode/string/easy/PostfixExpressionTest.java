package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class PostfixExpressionTest {

    @Test
    public void evaluatePostfix1() {
        assertEquals(-4, PostfixExpression.evaluatePostfix("231*+9-"));
    }

    @Test
    public void evaluatePostfix2() {
        assertEquals(-4, PostfixExpression.evaluatePostfixStack("231*+9-"));
    }

}