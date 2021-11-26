package edu.university.leetcode.array.medium;

import edu.university.leetcode.array.medium.P56_MergeIntervals.Interval;

import java.util.Arrays;
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
        Arrays.sort(intervals, (o1, o2) -> o1.start - o2.start);
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

    public int minMeetingRoomsQueue(Interval[] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1.start - o2.start);
        PriorityQueue<Interval> pq = new PriorityQueue<>((o1, o2) -> o1.end - o2.end);
        for (Interval interval : intervals) {
            Interval tmp = pq.poll();
            if (tmp == null || interval.start < tmp.end) {
                pq.offer(interval);
                if (tmp == null) {
                    continue;
                }
            } else {
                tmp.end = interval.end;
            }
            pq.offer(tmp);
        }
        return pq.size();
    }

    /**
     * sorted by start time and end time into 2 arrays
     * use the pointer to maintain the minimum value of the next end time as a simulation of poll() in PriorityQueue
     */
    public int minMeetingRoomsArray(Interval[] intervals) {
        int room = 0, pt = 0, len = intervals.length;
        int[] start = new int[len], end = new int[len];
        for (int i = 0; i < len; i++) {
            start[i] = intervals[i].start;
            end[i] = intervals[i].end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        for (int i = 0; i < len; i++) {
            if (start[i] < end[pt]) {
                room++;
            } else {
                pt++;
            }
        }
        return room;
    }

}
