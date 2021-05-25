package edu.university.leetcode.array.medium;

import edu.university.leetcode.array.medium.P56_MergeIntervals.Interval;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 253. Meeting Rooms II
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei),
 * find the minimum number of conference rooms required.
 * For example,
 * Given [[0, 30],[5, 10],[15, 20]], return 2.
 */
public class P253_MeetingRoomsII {
    public int minMeetingRooms(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) return 0;
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int minRoom = 1;
        queue.offer(intervals[0].end);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start < queue.peek()) {
                minRoom++;
            } else {
                queue.poll();
            }
            queue.offer(intervals[i].end);
        }
        return minRoom;
    }
}
