package edu.university.leetcode.array.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class P36_ValidSudokuTest {
    @Test
    public void isValidSudoku() throws Exception {
        char[] a1 = new char[]{'5', '3', '.', '.', '7', '.', '.', '.', '.'};
        char[] a2 = new char[]{'6', '.', '.', '1', '9', '5', '.', '.', '.'};
        char[] a3 = new char[]{'.', '9', '8', '.', '.', '.', '.', '6', '.'};
        char[] a4 = new char[]{'8', '.', '.', '.', '6', '.', '.', '.', '3'};
        char[] a5 = new char[]{'4', '.', '.', '8', '.', '3', '.', '.', '1'};
        char[] a6 = new char[]{'7', '.', '.', '.', '2', '.', '.', '.', '6'};
        char[] a7 = new char[]{'.', '6', '.', '.', '.', '.', '2', '8', '.'};
        char[] a8 = new char[]{'.', '.', '.', '4', '1', '9', '.', '.', '5'};
        char[] a9 = new char[]{'.', '.', '.', '.', '8', '.', '.', '7', '9'};
        char[][] test = new char[][] {a1, a2, a3, a4, a5, a6, a7, a8, a9};
        assertTrue(P36_ValidSudoku.isValidSudoku(test));
    }

}