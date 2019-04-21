package edu.university.leetcode.number.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 246. Strobogrammatic Number
 * A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).
 * Write a function to determine if a number is strobogrammatic. The number is represented as a string.
 * For example, the numbers "69", "88", and "818" are all strobogrammatic.
 */
public class P246_StrobogrammaticNumber {

    public static boolean isStrobogrammatic(String num) {
        if (num == null || num.length() == 0) return false;
        int low = 0, high = num.length() - 1;
        char[] chars = num.toCharArray();
        while (low <= high) {
            char c = chars[low];
            if (!map.containsKey(c)) {
                return false;
            } else if (map.get(c) != num.charAt(high)) {
                return false;
            } else {
                low++;
                high--;
            }
        }
        return true;
    }

    private static final Map<Character, Character> map = new HashMap<Character, Character>() {{
        put('0', '0');
        put('1', '1');
        put('6', '9');
        put('8', '8');
        put('9', '6');
    }};

}
