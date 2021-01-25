package edu.university.leetcode.array.medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    private static final Logger LOG = LoggerFactory.getLogger(P347_TopKFrequentElements.class);
    /**
     * sort by frequency + pick top k
     * Time complexity: O(n log(n))
     * Space complexity: O(n)
     */
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
           if (map.containsKey(n)) {
               map.put(n, map.get(n) + 1);
           } else { map.put(n, 1);
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

    /**
     * Bucket Sort
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public static int[] topKFrequentBucketSort(int[] nums, int k) {
        List[] buckets = new List[nums.length + 1];
        Map<Integer, Integer> counts = new HashMap<>();
        for (int n : nums) {
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }
        LOG.info("counts = {}", counts);
        for (int n : counts.keySet()) {
            int c = counts.get(n);
            if (buckets[c] == null) {
                buckets[c] = new ArrayList<Integer>();
            }
            buckets[c].add(n);
            LOG.info("buckets {} {}", c, buckets[c]);
        }
        for (int i = 0; i < buckets.length; i++) {
            LOG.info("buckets {} {}", i, buckets[i]);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = buckets.length - 1; i > 0 && result.size() < k; i--) {
            if (buckets[i] != null) result.addAll(buckets[i]);
        }
        LOG.info("result = {}", result);
        return result.stream().mapToInt(i->i).toArray();
    }
}
