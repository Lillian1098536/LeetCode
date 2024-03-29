package edu.university.leetcode.string.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * P. 20 Valid Parentheses
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
@Slf4j
public class P20_ValidParentheses {

    public static boolean isValid1(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            log.debug("i={}", i);
            char curr = s.charAt(i);
            log.debug("curr={}", curr);
            if (map.keySet().contains(curr)) {
                stack.push(curr);
                log.debug("after push stack={}", stack);
            } else if (map.values().contains(curr)) {
                log.debug("stack.peek()={}", stack.peek());
                if (!stack.empty() && map.get(stack.peek()) == curr) {
                    stack.pop();
                    log.debug("after pop stack={}", stack);
                } else {
                    log.debug("stack={}", stack);
                    return false;
                }
            }
        }
        log.debug("stack.empty()={}", stack.empty());
        return stack.empty();
    }

    private static Map<Character, Character> map = new HashMap<Character, Character>() {{
        put('(', ')');
        put('{', '}');
        put('[', ']');
    }};

    public static boolean isValid2(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            int q = "(){}[]".indexOf(s.substring(i, i + 1));
            log.debug("q={} substring = {}", q, s.substring(i, i + 1));
            if (q % 2 == 1) {
                log.info("pop({})", stack.peek());
                if (stack.isEmpty() || stack.pop() != q - 1)
                    return false;
            } else {
                log.info("push({})", q);
                stack.push(q);
            }
        }
        return stack.empty();
    }

    /**
     * brute force
     * @param s
     * @return
     */
    public boolean isValid3(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                char pre = stack.pop();
                if (pre == '(' && c != ')') return false;
                if (pre == '{' && c != '}') return false;
                if (pre == '[' && c != ']') return false;
            }
        }
        return stack.isEmpty();
    }

    /**
     * assume it's a pair
     * @param s
     * @return
     */
    public boolean isValid4(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }
}
