package edu.university.leetcode.string.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * 500. Keyboard Row
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of
 * American keyboard like the image below.
 * Example: Input: ["Hello", "Alaska", "Dad", "Peace"] Output: ["Alaska", "Dad"]
 * Note:
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 */
public class P500_KeyboardRow {

    private static final int[] group = new int[128];

    static {
        group['q'] = 1;
        group['w'] = 1;
        group['e'] = 1;
        group['r'] = 1;
        group['t'] = 1;
        group['y'] = 1;
        group['u'] = 1;
        group['i'] = 1;
        group['o'] = 1;
        group['p'] = 1;
        group['Q'] = 1;
        group['W'] = 1;
        group['E'] = 1;
        group['R'] = 1;
        group['T'] = 1;
        group['Y'] = 1;
        group['U'] = 1;
        group['I'] = 1;
        group['O'] = 1;
        group['P'] = 1;

        group['a'] = 2;
        group['s'] = 2;
        group['d'] = 2;
        group['f'] = 2;
        group['g'] = 2;
        group['h'] = 2;
        group['j'] = 2;
        group['k'] = 2;
        group['l'] = 2;
        group['A'] = 2;
        group['S'] = 2;
        group['D'] = 2;
        group['F'] = 2;
        group['G'] = 2;
        group['H'] = 2;
        group['J'] = 2;
        group['K'] = 2;
        group['L'] = 2;

        group['z'] = 3;
        group['x'] = 3;
        group['c'] = 3;
        group['v'] = 3;
        group['b'] = 3;
        group['n'] = 3;
        group['m'] = 3;
        group['Z'] = 3;
        group['X'] = 3;
        group['C'] = 3;
        group['V'] = 3;
        group['B'] = 3;
        group['N'] = 3;
        group['M'] = 3;
    }

    public P500_KeyboardRow() {
    }

    public String[] findWords(String[] words) {
        List<String> resultList = new LinkedList<>();
        for (String word : words) {
            if (isSameRow(word.toCharArray())) {
                resultList.add(word);
            }
        }
        return resultList.toArray(new String[resultList.size()]);
    }

    private static boolean isSameRow(char[] chars){
        for(int i = 1; i < chars.length; i++){
            if(group[chars[i - 1]] != group[chars[i]]){
                return false;
            }
        }
        return true;
    }

}
