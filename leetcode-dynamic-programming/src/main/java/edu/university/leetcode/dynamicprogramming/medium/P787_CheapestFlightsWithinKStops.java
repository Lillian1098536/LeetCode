package edu.university.leetcode.dynamicprogramming.medium;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * 787. Cheapest Flights Within K Stops
 * There are n cities connected by m flights. Each fight starts from city u and arrives at v with a price w.
 * Now given all the cities and flights, together with starting city src and the destination dst,
 * your task is to find the cheapest price from src to dst with up to k stops. If there is no such route, output -1.
 * Example:
 * Input: n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]] src = 0, dst = 2, K = 1
 * Output: 200
 * Explanation: The cheapest price from city 0 to city 2 with at most 1 stop costs 200, as marked red in the picture.
 *
 * Solution: Bellman-Ford algorithm
 * dp[k][i]: min cost from src to i taken up to k flights (k - 1 stops)
 * init: dp[0:k+2][src] = 0
 * transition: dp[k][i] = min(dp[k-1][j] + price[j][i])
 * ans: dp[K+1][dst]
 * Time complexity: O(k * |flights|) / O(k * n ^ 2)
 * Space complexity: O(k * n) -> O(n)
 * w/o space compression O(k * n)
 */
@Slf4j
public class P787_CheapestFlightsWithinKStops {

    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        // 1 << 30 = 1073741824
        // Integer.MAX_VALUE / 2  = 1073741823
        final int K_COST = 1 << 30;
        int[] costs = new int[n];
        Arrays.fill(costs, K_COST);
        costs[src] = 0;
        log.info("init costs = {}", costs);
        for (int i = 0; i <= K; i++) {
            int[] tmp = Arrays.copyOf(costs, n);
            for (int[] flight : flights) {
                tmp[flight[1]] = Math.min(tmp[flight[1]], costs[flight[0]] + flight[2]);
                log.info("i = {} tmp = {}", i, tmp);
            }
            costs = tmp;
            log.info("i = {}                            costs = {}", i, costs);
        }
        return costs[dst] >= K_COST ? -1 : costs[dst];
    }

}
