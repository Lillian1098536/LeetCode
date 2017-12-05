package edu.university.leetcode.number.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class P70_ClimbingStairsTest {

    @Test
    public void climbStairs() throws Exception {
        int result = P70_ClimbingStairs.climbStairs(4);
        assertEquals(5, result);
    }

    @Test
    public void countWays() throws Exception {
        int result = P70_ClimbingStairs.countWays(5);
        assertEquals(8, result);
    }

}