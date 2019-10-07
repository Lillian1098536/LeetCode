package edu.university.leetcode.string.easy;

/**
 * 557. Reverse Words in a String III
 * Given a string, you need to reverse the order of characters in each word within a sentence
 * while still preserving whitespace and initial word order.
 * Example 1: Input: "Let's take LeetCode contest" Output: "s'teL ekat edoCteeL tsetnoc"
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
public class P557_ReverseWordsInAStringIII {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for (String word : words) {
            word = reverseWord(word);
            if (isFirst) {
                sb.append(word);
                isFirst = false;
            } else {
                sb.append(" " + word);
            }
        }
        return sb.toString();
    }

    private String reverseWord(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            char tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        return new String(arr);
    }

}
