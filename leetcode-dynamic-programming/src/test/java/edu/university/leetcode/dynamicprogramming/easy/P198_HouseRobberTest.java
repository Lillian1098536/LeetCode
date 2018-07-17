package edu.university.leetcode.dynamicprogramming.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P198_HouseRobberTest {
    @Test
    public void rob1() throws Exception {
        int result = P198_HouseRobber.rob(new int [] {2,7,9,3,1});
        assertEquals(12, result);
    }

    @Test
    public void rob2() throws Exception {
        int result = P198_HouseRobber.robHouse(new int [] {2,7,9,3,1});
        assertEquals(12, result);
    }

}