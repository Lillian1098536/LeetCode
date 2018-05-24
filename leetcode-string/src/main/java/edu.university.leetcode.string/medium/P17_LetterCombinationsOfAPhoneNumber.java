package edu.university.leetcode.string.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
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
        String[] dic = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(res, digits, sb, dic, 0);
        return res;
    }

    private static void dfs(List<String> res, String digits, StringBuilder sb, String[] dic, int pos) {
        if (digits.length() == pos) {
            log.info("res.add(sb.toString()) = {}", sb.toString());
            res.add(sb.toString());
            return;
        } else {
            String str = dic[digits.charAt(pos) - '0'];
            log.info("str = {}", str);
            for (int i = 0; i < str.length(); i++) {
                log.info("          sb.append = {}", dic[digits.charAt(pos) - '0'].charAt(i));
                sb.append(str.charAt(i));
                dfs(res, digits, sb, dic, pos + 1);
                log.info("                              sb.delete = {}", sb.charAt(sb.length() - 1));
                sb.deleteCharAt(sb.length() - 1);
            }
        }

    }


}
