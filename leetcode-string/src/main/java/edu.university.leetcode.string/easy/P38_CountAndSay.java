package edu.university.leetcode.string.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 38. Count and Say
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * 1.     1         1 is read off as "one 1" or 11.
 * 2.     11        11 is read off as "two 1s" or 21.
 * 3.     21        21 is read off as "one 2, then one 1" or 1211.
 * 4.     1211
 * 5.     111221
 * Given an integer n, generate the nth term of the count-and-say sequence.
 * Note: Each term of the sequence of integers will be represented as a string.
 * Example 1: Input: 1 Output: "1"
 * Example 2: Input: 4 Output: "1211"
 */
@Slf4j
public class P38_CountAndSay {

    public static String countAndSay(int n) {
        if (n <= 0) {
            return "";
        }
        String result = "1";
        int i = 1, count = 0;
        while (i < n) {
            log.debug("i={} result={}", i, result);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < result.length(); j++) {
                count++;
                if (j == result.length() - 1 || result.charAt(j) != result.charAt(j + 1)) {
                    sb.append(count);
                    sb.append(result.charAt(j));
                    count = 0;
                }
                log.debug("j={} count={} sb={}", j, count, sb.toString());
            }
            result = sb.toString();
            log.debug("after i={} result={}", i, result);
            i++;
        }
        return result;
    }

}
