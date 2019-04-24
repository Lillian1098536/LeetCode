package edu.university.leetcode.string.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class P293_FlipGameTest {

    @Test
    public void generatePossibleNextMoves() {
        List<String> expected = new ArrayList<>();
        expected.add("--++");
        expected.add("+--+");
        expected.add("++--");
        List<String> result = P293_FlipGame.generatePossibleNextMoves("++++");
        for (int i = 0; i < result.size(); i++) {
            assertTrue(result.get(i).equals(expected.get(i)));
        }
    }

}