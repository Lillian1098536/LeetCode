package edu.university.leetcode.string.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * 68. Text Justification
 * Given an array of words and a width maxWidth, format the text such that each line has exactly maxWidth characters and is fully (left and right) justified.
 * You should pack your words in a greedy approach; that is, pack as many words as you can in each line.
 * Pad extra spaces ' ' when necessary so that each line has exactly maxWidth characters.
 * Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line do not
 * divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.
 * For the last line of text, it should be left justified and no extra space is inserted between words.
 * Note:
 * A word is defined as a character sequence consisting of non-space characters only.
 * Each word's length is guaranteed to be greater than 0 and not exceed maxWidth.
 * The input array words contains at least one word.
 * Example 1: Input: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
 * Output:
 * [
 * "This    is    an",
 * "example  of text",
 * "justification.  "
 * ]
 * Example 2: Input: words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
 * Output:
 * [
 * "What   must   be",
 * "acknowledgment  ",
 * "shall be        "
 * ]
 * Explanation: Note that the last line is "shall be    " instead of "shall     be", because the last line must be left-justified instead of fully-justified.
 * Note that the second line is also left-justified becase it contains only one word.
 * Example 3: Input: words = ["Science","is","what","we","understand","well","enough","to","explain","to","a","computer.",
 * "Art","is","everything","else","we","do"], maxWidth = 20
 * Output:
 * [
 * "Science  is  what we",
 * "understand      well",
 * "enough to explain to",
 * "a  computer.  Art is",
 * "everything  else  we",
 * "do                  "
 * ]
 * Constraints:
 * 1 <= words.length <= 300
 * 1 <= words[i].length <= 20
 * words[i] consists of only English letters and symbols.
 * 1 <= maxWidth <= 100
 * words[i].length <= maxWidth
 */
public class P68_TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int n = words.length, j = 0;
        int[] ps = new int[n];
        for (int i = 1; i < n; i++) {
            ps[i] = ps[i - 1] + words[i].length();
        }
        while (j < n) {
            int k = binarySearch(ps, j, maxWidth);
            int totalSpaces = maxWidth - (ps[k] - (j > 0 ? ps[j - 1] : 0));
            int wordCnt = k - j + 1;
            StringBuilder sb = new StringBuilder();
            if (k == n - 1) {
                addWordsWithSpace(sb, words, j, k, 1);
                addNSpaces(sb, totalSpaces - k + j);
            } else if (wordCnt <= 2) {
                sb.append(words[j]);
                addNSpaces(sb, totalSpaces);
                if (k > j) {
                    sb.append(words[k]);
                }
            } else {
                int spaceCnt = totalSpaces / (wordCnt - 1);
                int extra = totalSpaces % (wordCnt - 1);
                addWordsWithSpace(sb, words, j, j + extra, spaceCnt + 1);
                addNSpaces(sb, spaceCnt);
                addWordsWithSpace(sb, words, j + extra + 1, k, spaceCnt);
            }
            result.add(sb.toString());
            j = k + 1;
        }
        return result;
    }

    private void addWordsWithSpace(StringBuilder sb, String[] words, int l, int r, int spaceCnt) {
        for (int i = l; i <= r; i++) {
            sb.append(words[i]);
            if (i < r) {
                addNSpaces(sb, spaceCnt);
            }
        }
    }

    private void addNSpaces(StringBuilder sb, int n) {
        for (int i = 0; i < n; i++) {
            sb.append(" ");
        }
    }

    private int binarySearch(int[] ps, int start, int target) {
        int l = start, r = ps.length - 1;
        while (l < r - 1) {
            int mid = l + (r - l) / 2;
            if (ps[mid] - (start > 0 ? ps[start - 1] : 0) + mid - start > target) {
                r = mid - 1;
            } else {
                l = mid;
            }
        }
        if (ps[r] - (start > 0 ? ps[start - 1] : 0) + r - start <= target) {
            return r;
        }
        return l;
    }

    public static void main(String[] args) {
        P68_TextJustification test = new P68_TextJustification();
        String[] words = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
        System.out.println(test.fullJustify(words, 16).toString()
                .replaceAll("\\[", "[\n")
                .replaceAll("]", "\n]")
                .replaceAll(",", ",\n"));
    }
}
