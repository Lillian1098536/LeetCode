package edu.university.leetcode.array.easy;

/**
 * 441. Arranging Coins
 * You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
 * Given n, find the total number of full staircase rows that can be formed.
 * n is a non-negative integer and fits within the range of a 32-bit signed integer.
 * Example 1: n = 5 The coins can form the following rows:
 * ¤
 * ¤ ¤
 * ¤ ¤
 * Because the 3rd row is incomplete, we return 2.
 * Example 2: n = 8 The coins can form the following rows:
 * ¤
 * ¤ ¤
 * ¤ ¤ ¤
 * ¤ ¤
 * Because the 4th row is incomplete, we return 3.
 * sum = n * (n + 1) / 2
 * n = (sqrt(sum * 8 + 1) - 1) / 2;
 */
public class P441_ArrangingCoins {

    public static int arrangeCoins(int n) {
        int line = 0;
        for(int i = 1; i <= n; i++){
            n -= i;
            line++;
        }
        return line;
    }

    public static int arrange(int n) {
        return (int)((Math.sqrt((long)n * 8 + 1) - 1) / 2);
    }

}
