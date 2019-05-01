package edu.university.leetcode.string.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class P438_FindAllAnagramsInAStringTest {

    @Test
    public void findAnagrams1() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 6));
        List<Integer> result = P438_FindAllAnagramsInAString.findAnagrams("cbaebabacd", "abc");
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    public void findAnagrams2() {
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 2));
        List<Integer> result = P438_FindAllAnagramsInAString.findAnagrams("abab", "ab");
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    public void findAnagrams3() {
        List<Integer> result = P438_FindAllAnagramsInAString.findAnagrams("af", "be");
        assertTrue(result.size() == 0);
    }
}