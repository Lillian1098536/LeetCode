package edu.university.leetcode.string.easy;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class P290_WordPatternTest {
    @Test
    public void wordPattern1() throws Exception {
        assertTrue(P290_WordPattern.wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    public void wordPattern2() throws Exception {
        assertTrue(!P290_WordPattern.wordPattern("abba", "dog cat cat fish"));
    }

    public static void main(String[] args) {
        Map index = new HashMap();
        System.out.println("a, 0\t" + index.put("a", 0));
        System.out.println("dog, 0\t" + index.put("dog", 0));
        System.out.println("b, 1\t" + index.put("b", 1));
        System.out.println("cat, 1\t" + index.put("cat", 1));
        System.out.println("b, 2\t" + index.put("b", 2));
        System.out.println("cat, 2\t" + index.put("cat", 2));
        System.out.println("a, 3\t" + index.put("a", 3));
        System.out.println("fish, 3\t" + index.put("fish", 3));
    }

}