package edu.university.leetcode.number.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 204. Count Primes
 * Count the number of prime numbers less than a non-negative number, n.
 * Example: Input: 10 Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 * 499979
 */
@Slf4j
public class P204_CountPrimes {

    public static int countPrimes(int n) {
        int count = 0;
        boolean[] dp = new boolean[n];
        for (int i = 2; i < n; i++) {
            log.info("i={}", i);
            if (!dp[i]) {
                count++;
                log.info("     count[{}]={}", i, count);
                for (int j = i; j * i < n; j++) {
                    dp[j * i] = true;
                    log.info("          j * i = {}", j * i);
                }
            }
        }
        log.info("final count={}", count);
        return count;
    }


    public static int count(int n) {
        if (n < 3) {
            return 0;
        }
        int count = n / 2;
        boolean[] dp = new boolean[n];
        for (int i = 3; i * i < n; i += 2) {
            log.info("i={}", i);
            if (dp[i]) {
                log.info("continue");
                continue;
            }
            for (int j = i * i; j < n; j += i * 2) {
                log.info("    j={}", j);
                if (!dp[j]) {
                    --count;
                    dp[j] = true;
                    log.info("        count={}", count);
                }
            }

        }
        return count;
    }

}
