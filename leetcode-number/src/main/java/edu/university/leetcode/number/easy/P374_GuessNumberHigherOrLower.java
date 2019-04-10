package edu.university.leetcode.number.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 374. Guess Number Higher or Lower
 * We are playing the Guess Game. The game is as follows:
 * I pick a number from 1 to n. You have to guess which number I picked.
 * Every time you guess wrong, I'll tell you whether the number is higher or lower.
 * You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
 * -1 : My number is lower
 *  1 : My number is higher
 *  0 : Congrats! You got it!
 * Example : Input: n = 10, pick = 6  Output: 6
 * The guess API is defined in the parent class GuessGame.
 * @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
 * int guess(int num);
 */
@Slf4j
public class P374_GuessNumberHigherOrLower {

    private int target = 5;

    public int guessNumber(int n) {
        if (guess(n) == 0) return n;
        int left = 0, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2, tmp = guess(mid);
            if (tmp == 1) {
                left = mid;
            } else if (tmp == -1) {
                right = mid;
            } else {
                return mid;
            }
        }
        return left;
    }

    private int guess(int n) {
        if (n < target) {
            log.info("My number is lower");
            return -1;
        } else if ( n > target) {
            log.info("My number is higher");
            return 1;
        } else {
            log.info("Congrats! You got it!");
            return 0;
        }
    }
}
