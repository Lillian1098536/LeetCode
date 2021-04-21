package edu.university.leetcode.string.medium;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class P17_LetterCombinationsOfAPhoneNumberTest {
    @Test
    public void letterCombinations1() throws Exception {
        String digits = "23";
        List<String> result =  P17_LetterCombinationsOfAPhoneNumber.letterCombinations(digits);
        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        for(int i = 0; i < result.size(); i++) {
            assertEquals(result.get(i), expected.get(i));
        }
    }

}