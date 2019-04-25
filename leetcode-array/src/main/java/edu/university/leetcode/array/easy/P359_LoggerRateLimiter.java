package edu.university.leetcode.array.easy;

import javafx.util.Pair;
import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 359. Logger Rate Limiter
 * Design a logger system that receive stream of messages along with its timestamps,
 * each message should be printed if and only if it is not printed in the last 10 seconds.
 * Given a message and a timestamp (in seconds granularity),
 * return true if the message should be printed in the given timestamp, otherwise returns false.
 * It is possible that several messages arrive roughly at the same time.
 * Example: Logger logger = new Logger();
 * logging string "foo" at timestamp 1 returns true;
 * logging string "bar" at timestamp 2 returns true;
 * logging string "foo" at timestamp 3 returns false;
 * logging string "bar" at timestamp 8 returns false;
 * logging string "foo" at timestamp 10 returns false;
 * logging string "foo" at timestamp 11 returns true;
 */
@Slf4j
public class P359_LoggerRateLimiter {

    public static void main(String[] args) {
        Logger logger = new Logger();
        log.info("1 foo {}", logger.shouldPrintMessage(1, "foo"));
        log.info("2 bar {}", logger.shouldPrintMessage(2, "bar"));
        log.info("3 foo {}", logger.shouldPrintMessage(3, "foo"));
        log.info("8 bar {}", logger.shouldPrintMessage(8, "bar"));
        log.info("10 foo {}", logger.shouldPrintMessage(10, "foo"));
        log.info("11 foo {}", logger.shouldPrintMessage(11, "foo"));
    }

    static class Logger{

        public Logger() {}

        private Set<String> cache = new HashSet<>();
        private Queue<Pair<Integer, String>> last10 = new LinkedList<>();

        public boolean shouldPrintMessage(int timestamp, String message) {
            Pair<Integer , String> key = last10.peek();
            while (!last10.isEmpty()) {
                if (timestamp - key.getKey() >= 10) {
                    last10.poll();
                    cache.remove(key.getValue());
                } else {
                    break;
                }
            }
            if (cache.contains(message)) {
                return false;
            }
            cache.add(message);
            last10.add(new Pair<>(timestamp, message));
            return true;
        }
    }

}
