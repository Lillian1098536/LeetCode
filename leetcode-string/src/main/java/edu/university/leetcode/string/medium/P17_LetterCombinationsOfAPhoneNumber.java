package edu.university.leetcode.string.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 17. Letter Combinations of a Phone Number
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 * Example: Input: "23" Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
@Slf4j
public class P17_LetterCombinationsOfAPhoneNumber {

    public static List<String> letterCombinations(String digits) {
        char[][] dic = {{}, {}, {'a','b','c'}, {'d','e','f'}, {'g','h','i'}, {'j','k','l'}, {'m','n','o'}, {'p','q','r','s'}, {'t','u','v'}, {'w','x','y','z'}};
        List<String> res = new LinkedList<>();
        if (digits == null || digits.isBlank()) return res;
        dfs(res, digits.toCharArray(), new char[digits.length()], dic, 0);
        return res;
    }

    private static void dfs(List<String> res, char[] digits, char[] c, char[][] dic, int pos) {
        log.info("digits = {} pos = {}", digits, pos);
        if (digits.length == pos) {
            log.info("res.add(c) = {}", String.valueOf(c));
            res.add(String.valueOf(c));
        } else {
            for (char cur : dic[digits[pos] - '0']) {
                log.info("                      cur = {} c = {}", cur, c);
                c[pos] = cur;
                dfs(res, digits, c, dic,pos + 1);
            }
        }
    }
}
