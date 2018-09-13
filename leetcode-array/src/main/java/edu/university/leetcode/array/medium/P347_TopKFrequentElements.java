package edu.university.leetcode.array.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 347. Top K Frequent Elements
 * Given a non-empty array of integers, return the k most frequent elements.
 * Example 1: Input: nums = [1,1,1,2,2,3], k = 2 Output: [1,2]
 * Example 2: Input: nums = [1], k = 1 Output: [1]
 */
public class P347_TopKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
           if (map.containsKey(n)) {
               map.put(n, map.get(n) + 1);
           } else {
               map.put(n, 1);
           }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        for (int i = 0; i < k; i++) {
            result.add(list.get(i).getKey());
        }
        return result;
    }

}
