package edu.university.leetcode.dynamicprogramming.easy;

/**
 * Collatz Conjecture
 * https://en.wikipedia.org/wiki/Collatz_conjecture
 * a conjecture in mathematics
 * f(n) = {
 *     if n % 2 == 0, return n / 2
 *     if n % 2 == 1, return n * 3 + 1
 * } finally ==> 1
 */
public class CollatzConjecture {
    public int collatz(int n) {
        if (n < 1) return 0;
        while (n > 1) {
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
        }
        return n;
    }
}
