package edu.university.leetcode.list.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 359. Logger Rate Limiter
 * Design a logger system that receive stream of messages along with its timestamps, each message should be printed if and only if it is not printed in the last 10 seconds.
 * Given a message and a timestamp (in seconds granularity), return true if the message should be printed in the given timestamp, otherwise returns false.
 * It is possible that several messages arrive roughly at the same time.
 * Example:
 * Logger logger = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 * logger.shouldPrintMessage(1, "foo"); returns true;
 * logger.shouldPrintMessage(2,"bar"); returns true;
 * logger.shouldPrintMessage(3,"foo"); returns false;
 * logger.shouldPrintMessage(8,"bar"); returns false;
 * logger.shouldPrintMessage(10,"foo"); returns false;
 * logger.shouldPrintMessage(11,"foo"); returns true;
 */
public class P359_LoggerRateLimiter {
    Map<String, Integer> map = new HashMap<>();
    int limiter = 10;
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (!map.containsKey(message) || timestamp - map.get(message) >= limiter) {
            map.put(message, timestamp);
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        P359_LoggerRateLimiter test = new P359_LoggerRateLimiter();
        System.out.println("should return true >>> " + test.shouldPrintMessage(1, "foo"));
        System.out.println("should return true >>> " + test.shouldPrintMessage(2,"bar"));
        System.out.println("should return false >>> " + test.shouldPrintMessage(3,"foo"));
        System.out.println("should return false >>> " + test.shouldPrintMessage(8,"bar"));
        System.out.println("should return false >>> " + test.shouldPrintMessage(10, "foo"));
        System.out.println("should return true >>> " + test.shouldPrintMessage(11, "foo"));

    }
}
