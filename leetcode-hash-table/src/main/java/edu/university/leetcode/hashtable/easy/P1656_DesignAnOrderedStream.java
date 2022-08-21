package edu.university.leetcode.hashtable.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1656. Design an Ordered Stream
 * There is a stream of n (idKey, value) pairs arriving in an arbitrary order, where idKey is an integer between 1 and n and value is a string.
 * No two pairs have the same id.
 * Design a stream that returns the values in increasing order of their IDs by returning a chunk (list) of values after each insertion.
 * The concatenation of all the chunks should result in a list of the sorted values.
 * Implement the OrderedStream class:
 * OrderedStream(int n) Constructs the stream to take n values.
 * String[] insert(int idKey, String value) Inserts the pair (idKey, value) into the stream,
 * then returns the largest possible chunk of currently inserted values that appear next in the order.
 * Input
 * ["OrderedStream", "insert", "insert", "insert", "insert", "insert"]
 * [[5], [3, "ccccc"], [1, "aaaaa"], [2, "bbbbb"], [5, "eeeee"], [4, "ddddd"]]
 * Output
 * [null, [], ["aaaaa"], ["bbbbb", "ccccc"], [], ["ddddd", "eeeee"]]
 * Constraints:
 * 1 <= n <= 1000
 * 1 <= id <= n
 * value.length == 5
 * value consists only of lowercase letters.
 * Each call to insert will have a unique id.
 * Exactly n calls will be made to insert.
 */
public class P1656_DesignAnOrderedStream {
    String[] s = new String[1001];
    int i, n;
    public P1656_DesignAnOrderedStream(int n) {
        Arrays.fill(s, "");
        i = 1;
        n = n;
    }
    public List<String> insert(int idKey, String value) {
        List<String> result = new ArrayList<>();
        s[idKey] = value;
        while (s[i].length() == 5) {
            result.add(s[i++]);
        }
        return result;
    }
}
