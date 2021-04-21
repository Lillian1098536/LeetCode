package edu.university.leetcode.string.hard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

/**
 * 224. Basic Calculator
 * Given a string s representing an expression, implement a basic calculator to evaluate it.
 * Example 1: Input: s = "1 + 1" Output: 2
 * Example 2: Input: s = " 2-1 + 2 " Output: 3
 * Example 3: Input: s = "(1+(4+5+2)-3)+(6+8)" Output: 23
 * Constraints:
 * 1 <= s.length <= 3 * 105
 * s consists of digits, '+', '-', '(', ')', and ' '.
 * s represents a valid expression.
 */
public class P224_BasicCalculator {
    private static final Logger LOG = LoggerFactory.getLogger(P224_BasicCalculator.class);

    public int calculate(String s) {
        int result = 0, len = s.length(), sign = 1;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            LOG.info("c={} stack={} result={}", s.charAt(i), stack, result);
            if (Character.isDigit(s.charAt(i))) {
                int sum = s.charAt(i) - '0';
                while (i + 1 < len && Character.isDigit(s.charAt(i + 1))) {
                    sum = sum * 10 + s.charAt(i + 1) - '0';
                    i++;
                }
                result += sum * sign;
            } else if (s.charAt(i) == '+') {
                sign = 1;
            } else if (s.charAt(i) == '-') {
                sign = -1;
            } else if (s.charAt(i) == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (s.charAt(i) == ')') {
                result = result * stack.pop() + stack.pop();
            }
            LOG.info("    stack={} result={}", stack, result);
        }
        return result;
    }
}
