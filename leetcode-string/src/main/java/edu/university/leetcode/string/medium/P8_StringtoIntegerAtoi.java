package edu.university.leetcode.string.medium;

import org.jsoup.helper.StringUtil;

 /**
 * 8. String to Integer atoi
 * Implement atoi to convert a string to an integer.
 * Hint: Carefully consider all possible input cases.
 * If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 * str.charAt(i) - '0' to check integer
 */
public class P8_StringtoIntegerAtoi {

    public static int myAtoi(String str) {
        if (StringUtil.isBlank(str)) {
            return 0;
        }
        // trim white spaces
        str = str.trim();

        char flag = '+';

        // check negative or positvie
        int i = 0;
        if (str.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }

        double result = 0;

        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }

        if (flag == '-') {
            result = - result;
        }

        //check overflow
        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int)result;
    }
}
