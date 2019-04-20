package edu.university.leetcode.number.easy;

/**
 * 243. Shortest Word Distance
 * Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.
 * For example,
 * Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 * Given word1 = “coding”, word2 = “practice”, return 3.
 * Given word1 = "makes", word2 = "coding", return 1.
 * Note: You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.
 */
public class P243_ShortestWordDistance {

    public static int shortestDistance(String[] words, String word1, String word2) {
        int p1 = -1, p2 = -1, result = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (word1 == words[i]) {
                p1 = i;
            } else if (word2 == words[i]) {
                p2 = i;
            }
            if (p1 != -1 && p2 != -1) {
                result = Math.min(result, Math.abs(p1 - p2));
            }
        }
        return result;
    }

}
