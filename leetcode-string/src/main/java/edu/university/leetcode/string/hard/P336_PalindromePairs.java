package edu.university.leetcode.string.hard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 336. Palindrome Pairs
 * Given a list of unique words, return all the pairs of the distinct indices (i, j) in the given list,
 * so that the concatenation of the two words words[i] + words[j] is a palindrome.
 * Example 1: Input: words = ["abcd","dcba","lls","s","sssll"]
 * Output: [[0,1],[1,0],[3,2],[2,4]]
 * Explanation: The palindromes are ["dcbaabcd","abcddcba","slls","llssssll"]
 * Example 2: Input: words = ["bat","tab","cat"]
 * Output: [[0,1],[1,0]]
 * Explanation: The palindromes are ["battab","tabbat"]
 * Example 3: Input: words = ["a",""]
 * Output: [[0,1],[1,0]]
 * Constraints:
 * 1 <= words.length <= 5000
 * 0 <= words[i].length <= 300
 * words[i] consists of lower-case English letters.
 */
public class P336_PalindromePairs {
    private static final Logger LOG = LoggerFactory.getLogger(P336_PalindromePairs.class);
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        if (words == null || words.length < 2) return result;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            for (int j = 0; j <= s.length(); j++) {
                String l = s.substring(0, j), r = s.substring(j);
                if (isPalindrome(l)) {
                    String reverseR = new StringBuilder(r).reverse().toString();
                    if (map.containsKey(reverseR) && map.get(reverseR) != i) {
                        LOG.info("l: s={} r={} i={} j={}", s, r, i, j);
                        List<Integer> item = new ArrayList<>();
                        item.add(map.get(reverseR));
                        item.add(i);
                        result.add(item);
                    }
                }
                if (isPalindrome(r)) {
                    String reverseL = new StringBuilder(l).reverse().toString();
                    if (map.containsKey(reverseL) && map.get(reverseL) != i && r.length() != 0) {
                        LOG.info("r: s={} l={} i={} j={}", s, l, i, j);
                        List<Integer> item = new ArrayList<>();
                        item.add(i);
                        item.add(map.get(reverseL));
                        result.add(item);
                    }
                }
            }
        }
        return result;
    }

    private boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        P336_PalindromePairs test = new P336_PalindromePairs();
        String[] words = new String[]{"abcd", "dcba", "lls", "s", "sssll"};
        List<List<Integer>> result = test.palindromePairs(words);
        System.out.println("result >>> " + result);
    }

    public List<List<Integer>> palindromePairsByTrie(String[] words) {
        Trie trie = new Trie();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            trie.insert(words[i], i);
        }
        for (int i = 0; i < words.length; i++) {
            trie.find(words[i], i, result);
        }
        return result;
    }

        public static class TrieNode {
        int index;
        List<Integer> palindromeList;
        TrieNode[] children;
        public TrieNode() {
            index = -1;
            palindromeList = new ArrayList<>();
            children = new TrieNode[26];
        }
    }
    public static class Trie {
        TrieNode root;
        public Trie() { root = new TrieNode(); }
        public void insert(String str, int index) {
            TrieNode node = root;
            int i = 0, n = str.length();
            while (i < n) {
                if (isPalindrome(str, i, n - 1)) {
                    node.palindromeList.add(index);
                }
                int ch = str.charAt(i) - 'a';
                if (node.children[ch] == null) {
                    node.children[ch] = new TrieNode();
                }
                node = node.children[ch];
            }
            node.index = index;
        }
        public void find(String str, int index, List<List<Integer>> result) {
            TrieNode node = root;
            int n = str.length(), i = n - 1;
            for (; i >= 0; i--) {
                if (node.index != -1 && isPalindrome(str, 0, i)) {
                    result.add(Arrays.asList(node.index, index));
                }
                int ch = str.charAt(i) - 'a';
                if (node.children[ch] == null) return;
                node = node.children[ch];
            }
            if (node.palindromeList != null) {
                for (Integer k : node.palindromeList) {
                    result.add(Arrays.asList(k, index));
                }
            }
            if (node.index != -1 && node.index != index) {
                result.add(Arrays.asList(node.index, index));
            }
         }
        public boolean isPalindrome(String s, int l, int r) {
            while (l < r && s.charAt(l) == s.charAt(r)) {
                l++;
                r++;
            }
            return l >= r;
        }
    }
}
