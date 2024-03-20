package edu.university.leetcode.array.medium;

/**
 * 621. Task Scheduler
 */
public class P621_TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] cnt = new int[26];
        int max = 0, sum = 0;
        for (char c : tasks) {
            cnt[c - 'A']++;
        }
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, cnt[i]);
        }
        for (int i = 0; i < 26; i++) {
            sum += max == cnt[i] ? 1 : 0;
        }
        return Math.max(tasks.length, (n + 1) * (max - 1) + sum);
    }
}
