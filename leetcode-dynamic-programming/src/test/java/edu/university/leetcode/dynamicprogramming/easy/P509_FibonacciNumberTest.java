package edu.university.leetcode.dynamicprogramming.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P509_FibonacciNumberTest {
    P509_FibonacciNumber test = new P509_FibonacciNumber();
    @Test
    public void fib() {
        assertEquals(1, test.fib(2));
        assertEquals(2, test.fib(3));
        assertEquals(3, test.fib(4));
        assertEquals(144, test.fib(12));
    }

    @Test
    public void finonacci() {
        assertEquals(1, test.finonacci(2));
        assertEquals(2, test.finonacci(3));
        assertEquals(3, test.finonacci(4));
        assertEquals(144, test.finonacci(12));
    }
}