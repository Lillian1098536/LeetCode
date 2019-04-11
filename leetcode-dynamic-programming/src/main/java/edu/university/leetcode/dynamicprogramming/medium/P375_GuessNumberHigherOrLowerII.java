package edu.university.leetcode.dynamicprogramming.medium;

import lombok.extern.slf4j.Slf4j;

/**
 * 375. Guess Number Higher or Lower II
 * We are playing the Guess Game. The game is as follows:
 * I pick a number from 1 to n. You have to guess which number I picked.
 * Every time you guess wrong, I'll tell you whether the number I picked is higher or lower.
 * However, when you guess a particular number x, and you guess wrong, you pay $x. You win the game when you guess the number I picked.
 * Example: n = 10, I pick 8.
 * First round:  You guess 5, I tell you that it's higher. You pay $5.
 * Second round: You guess 7, I tell you that it's higher. You pay $7.
 * Third round:  You guess 9, I tell you that it's lower. You pay $9.
 * Game over. 8 is the number I picked.
 * You end up paying $5 + $7 + $9 = $21.
 * Given a particular n ≥ 1, find out how much money you need to have to guarantee a win.
 */
@Slf4j
public class P375_GuessNumberHigherOrLowerII {

    public static int getMoneyAmount(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        Integer[][] dp = new Integer[n + 1][n + 1];
        return countMoney(1, n, dp);

    }

    public static int countMoney(int l, int r, Integer[][] dp) {
        log.info("l = {} r = {}", l, r);
        if (l >= r) return 0;
        if (dp[l][r] != null) return dp[l][r];

        dp[l][r] = Integer.MAX_VALUE;
        for (int mid = l + (r - l) / 2; mid <= r; mid++) {
            log.info(">>>>>\t\tmid = {}", mid);
            dp[l][r] = Math.min(dp[l][r], mid + Math.max(countMoney(l, mid - 1, dp), countMoney(mid + 1, r, dp)));
            log.info(">>>>>\t\t>>>>>\t\tdp[l][r] = {}", dp[l][r]);
        }
        return dp[l][r];
    }

}
