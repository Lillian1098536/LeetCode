package edu.university.leetcode.string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 293. Flip Game
 * You are playing the following Flip Game with your friend: Given a string that contains only these two characters:
 * + and -, you and your friend take turns to flip twoconsecutive "++" into "--".
 * The game ends when a person can no longer make a move and therefore the other person will be the winner.
 * Write a function to compute all possible states of the string after one valid move.
 * For example, given s = "++++", after one move, it may become one of the following states:
 * [
 *   "--++",
 *   "+--+",
 *   "++--"
 * ]
 * If there is no valid move, return an empty list [].
 */
public class P293_FlipGame {

    public static List<String> generatePossibleNextMoves(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() < 2) return result;
        char[] chars = s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            if (chars[i] == '+' && chars[i - 1] == '+') {
                chars[i] = '-';
                chars[i - 1] = '-';
                result.add(String.valueOf(chars));
                chars[i] = '+';
                chars[i - 1] = '+';
            }
        }
        return result;
    }

}
