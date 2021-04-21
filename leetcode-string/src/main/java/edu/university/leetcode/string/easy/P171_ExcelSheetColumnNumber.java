package edu.university.leetcode.string.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 171. Excel Sheet Column Number
 * Related to question Excel Sheet Column Title
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * For example:
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 */
@Slf4j
public class P171_ExcelSheetColumnNumber {

    public static int titleToNumber(String s) {
        int result = 0;
        for(char c: s.toCharArray()) {
            result = result * 26 + c + 1 - 'A';
            log.debug("c={} result={}", c, result);
        }
        return result;
    }

}
