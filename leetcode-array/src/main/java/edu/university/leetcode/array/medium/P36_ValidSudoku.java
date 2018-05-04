package edu.university.leetcode.array.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

/**
 * 36. Valid Sudoku
 * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 */
@Slf4j
public class P36_ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        Set<Character> helper = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            helper.clear();
            for (int j = 0; j < 9; j++) {
                if (!help(helper, board[i][j]))
                    return false;
            }
        }
        for (int j = 0; j < 9; j++) {
            helper.clear();
            for (int i = 0; i < 9; i++) {
                if (help(helper, board[i][j]) == false)
                    return false;
            }
        }
        for (int i = 0; i < 9; i += 3) {
            log.debug("i = {}", i);
            for (int j = 0; j < 9; j += 3) {
                log.debug("      j = {}", j);
                helper.clear();
                for (int k = 0; k < 9; k++) {
                    log.debug("            k = {} i + k/3 = {} j + k%3 = {}", k, i + k / 3, j + k % 3);
                    if (!help(helper, board[i + k / 3][j + k % 3]))
                        return false;
                }
            }
        }
        return true;
    }

    private static boolean help(Set<Character> helper, char c) {
        if (c == '.') return true;
        if (helper.contains(c)) return false;
        helper.add(c);
        return true;
    }

}
