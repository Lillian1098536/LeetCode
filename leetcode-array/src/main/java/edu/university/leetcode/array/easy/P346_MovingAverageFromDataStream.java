package edu.university.leetcode.array.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;

/**
 * 346. Moving Average from Data Stream
 * Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.
 * For example, MovingAverage m = new MovingAverage(3);
 * m.next(1) = 1
 * m.next(10) = (1 + 10) / 2
 * m.next(3) = (1 + 10 + 3) / 3
 * m.next(5) = (10 + 3 + 5) / 3
 */
@Slf4j
public class P346_MovingAverageFromDataStream {

    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        log.info("next 1 = {}", movingAverage.next(1));
        log.info("next 10 = {}", movingAverage.next(10));
        log.info("next 3 = {}", movingAverage.next(3));
        log.info("next 5 = {}", movingAverage.next(5));

    }

    static class MovingAverage {
        double sum;
        int size;
        LinkedList<Integer> list;

        public MovingAverage(int size) {
            this.list = new LinkedList<>();
            this.size = size;
        }

        public double next(int val) {
            sum += val;
            list.offer(val);
            if (list.size() <= size) {
                return sum / list.size();
            }
            sum -= list.poll();
            return sum / size;
        }
    }
}
