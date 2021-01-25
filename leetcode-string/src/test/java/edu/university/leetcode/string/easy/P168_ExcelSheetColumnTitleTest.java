package edu.university.leetcode.string.easy;

import org.junit.Test;

import static edu.university.leetcode.string.easy.P168_ExcelSheetColumnTitle.convertToTitle;
import static org.junit.Assert.*;

public class P168_ExcelSheetColumnTitleTest {

    @Test
    public void testConvertToTitle() {
        assertEquals("A", convertToTitle(1));
        assertEquals("B", convertToTitle(2));
        assertEquals("AA", convertToTitle(27));
    }
}