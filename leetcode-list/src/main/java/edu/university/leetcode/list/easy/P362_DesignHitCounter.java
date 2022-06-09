package edu.university.leetcode.list.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 362. Design Hit Counter
 * Design a hit counter which counts the number of hits received in the past 5 minutes.
 * Each function accepts a timestamp parameter (in seconds granularity) and you may assume that calls are being made to
 * the system in chronological order (ie, the timestamp is monotonically increasing).
 * You may assume that the earliest timestamp starts at 1.
 * It is possible that several hits arrive roughly at the same time.
 * Example: HitCounter counter = new HitCounter();
 * counter.hit(1);          // hit at timestamp 1
 * counter.hit(2);          // hit at timestamp 2
 * counter.hit(3);          // hit at timestamp 3
 * counter.getHits(4);      // get hits at timestamp 4, should return 3
 * counter.hit(300);        // hit at timestamp 300
 * counter.getHits(300);    // get hits at timestamp 300, should return 4
 * counter.getHits(301);    // get hits at timestamp 301, should return 3
 * Follow up: What if the number of hits per second could be very large? Does your design scale?
 */
public class P362_DesignHitCounter {
    int limit = 5 * 60;
    /**
     * use a queue to cache the hit
     */
    Queue<Integer> queue = new LinkedList<>();
    public void hit(int timestamp) {
        queue.offer(timestamp);
    }

    public int getHits(int timestamp) {
        /**
         * if the head of queue is of the 5 minutes limit, pop it
         */
        while (!queue.isEmpty() && timestamp - queue.peek() >= limit) {
            System.out.println("if the head of queue is of the 5 minutes limit, getHits=" + timestamp+", pop=" + queue.peek());
            queue.poll();
        }
        return queue.size();
    }

    public static void main(String[] args) {
        P362_DesignHitCounter counter = new P362_DesignHitCounter();
        counter.hit(1);
        counter.hit(2);
        counter.hit(3);
        System.out.println("queue=" + counter.queue);
        System.out.println("should return 3 >>> " + counter.getHits(4));
        counter.hit(300);
        System.out.println("queue=" + counter.queue);
        System.out.println("should return 4 >>> " + counter.getHits(300));
        System.out.println("should return 3 >>> " + counter.getHits(301));
    }
}