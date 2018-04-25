package edu.university.leetcode.string.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class P171_ExcelSheetColumnNumberTest {
    @Test
    public void titleToNumber() throws Exception {
        int result = P171_ExcelSheetColumnNumber.titleToNumber("ABCB");
        assertEquals(19008, result);
    }

}