package edu.university.leetcode.number.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. Roman to Integer
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 */
public class P13_RomanToInteger {

    public static int romanToInt(String s) {

        char[] sc = s.toCharArray();
        int answer = toInt(sc[0]);
        for (int i = 1; i < s.length(); i++) {
            answer += toInt(sc[i]);
            if (toInt(sc[i - 1]) < toInt(sc[i])) {
                answer -= toInt(sc[i - 1]) * 2;
            }
        }
        return answer;
    }

    private static int toInt(char s) {
        switch (s) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }
        return 0;
    }

    public static int romanToInteger(String s) {
        int len = s.length();
        int answer = map.get(s.charAt(len - 1));
        for (int i = len - 2; i >= 0; i--) {
            if (map.get(s.charAt(i + 1)) >= map.get(s.charAt(i))) {
                answer -= map.get(s.charAt(i));
            } else {
                answer += map.get(s.charAt(i));
            }
        }
        return answer;
    }

    private static Map<Character, Integer> map = new HashMap<Character, Integer>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

}
