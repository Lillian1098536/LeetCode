package edu.university.leetcode.number.easy;

/**
 * 70. Climbing Stairs
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 * reach n’th stair from either (n-1)’th stair or from (n-2)’th stair.
 * ways(n) = ways(n-1) + ways(n-2)
 * Fibonacci numbers, the value of ways(n) is equal to fibonacci(n+1).
 */
public class P70_ClimbingStairs {

    public static int climbStairs(int n) {
        int pre = 0, cur = 1;
        for (int i = 0; i < n; i++) {
            int tmp = pre + cur;
            pre = cur;
            cur = tmp;
        }
        return cur;
    }

    // Returns number of ways to reach s'th stair
    public static int countWays(int s) {
        return fib(s + 1);
    }

    // A simple recursive program to find n'th fibonacci number
    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

}
