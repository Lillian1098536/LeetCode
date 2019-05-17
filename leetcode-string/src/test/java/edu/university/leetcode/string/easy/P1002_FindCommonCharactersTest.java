package edu.university.leetcode.string.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class P1002_FindCommonCharactersTest {

    @Test
    public void commonChars() {
        List<String> expected = Arrays.asList("e", "l", "l");//List.of("e", "l", "l");
        List<String> result = P1002_FindCommonCharacters.commonChars(new String[]{"bella", "label", "roller"});
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), result.get(i));
        }
    }

}