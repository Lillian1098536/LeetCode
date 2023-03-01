package edu.university.leetcode.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 359. Logger Rate Limiter
 * Design a logger system that receive stream of messages along with its timestamps, each message should be printed
 * if and only if it is not printed in the last 10 seconds.
 * Given a message and a timestamp (in seconds granularity), return true if the message should be printed in the given timestamp,
 * otherwise returns false.
 * It is possible that several messages arrive roughly at the same time.
 * Example:
 * Logger logger = new Logger();
 * logger.shouldPrintMessage(1, "foo"); returns true;
 * logger.shouldPrintMessage(2,"bar"); returns true;
 * logger.shouldPrintMessage(3,"foo"); returns false;
 * logger.shouldPrintMessage(8,"bar"); returns false;
 * logger.shouldPrintMessage(10,"foo"); returns false;
 * logger.shouldPrintMessage(11,"foo"); returns true;
 */
public class P359_PLoggerRateLimiter {
    private Map<String, Integer> map;
    public P359_PLoggerRateLimiter(){
        map = new HashMap<>();
    }

    /**
     * Hash Table
     * Time Complexity: O(1)
     * Space Complexity: O(n)
     * */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (!map.containsKey(message)) {
            map.put(message, timestamp);
            return true;
        } else if (timestamp - map.get(message) >= 10) {
            map.put(message, timestamp);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        P359_PLoggerRateLimiter test = new P359_PLoggerRateLimiter();
        System.out.println("expecting true >>> " + test.shouldPrintMessage(1, "foo"));
        System.out.println("expecting true >>> " + test.shouldPrintMessage(2, "bar"));
        System.out.println("expecting false >>> " + test.shouldPrintMessage(3, "foo"));
        System.out.println("expecting false >>> " + test.shouldPrintMessage(8, "bar"));
        System.out.println("expecting false >>> " + test.shouldPrintMessage(10, "foo"));
        System.out.println("expecting true >>> " + test.shouldPrintMessage(11, "foo"));

    }
}
