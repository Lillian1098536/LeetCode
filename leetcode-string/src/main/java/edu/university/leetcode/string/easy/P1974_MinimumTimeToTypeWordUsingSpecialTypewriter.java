package edu.university.leetcode.string.easy;

/**
 * 1974. Minimum Time to Type Word Using Special Typewriter
 * There is a special typewriter with lowercase English letters 'a' to 'z' arranged in a circle with a pointer.
 * A character can only be typed if the pointer is pointing to that character.
 * The pointer is initially pointing to the character 'a'.
 * Each second, you may perform one of the following operations:
 * Move the pointer one character counterclockwise or clockwise.
 * Type the character the pointer is currently on.
 * Given a string word, return the minimum number of seconds to type out the characters in word.
 * Example 1: Input: word = "abc" Output: 5
 * Explanation:
 * The characters are printed as follows:
 * - Type the character 'a' in 1 second since the pointer is initially on 'a'.
 * - Move the pointer clockwise to 'b' in 1 second.
 * - Type the character 'b' in 1 second.
 * - Move the pointer clockwise to 'c' in 1 second.
 * - Type the character 'c' in 1 second.
 * Example 2: Input: word = "bza" Output: 7
 * Explanation:
 * The characters are printed as follows:
 * - Move the pointer clockwise to 'b' in 1 second.
 * - Type the character 'b' in 1 second.
 * - Move the pointer counterclockwise to 'z' in 2 seconds.
 * - Type the character 'z' in 1 second.
 * - Move the pointer clockwise to 'a' in 1 second.
 * - Type the character 'a' in 1 second.
 * Example 3: Input: word = "zjpc" Output: 34
 * Explanation:
 * The characters are printed as follows:
 * - Move the pointer counterclockwise to 'z' in 1 second.
 * - Type the character 'z' in 1 second.
 * - Move the pointer clockwise to 'j' in 10 seconds.
 * - Type the character 'j' in 1 second.
 * - Move the pointer clockwise to 'p' in 6 seconds.
 * - Type the character 'p' in 1 second.
 * - Move the pointer counterclockwise to 'c' in 13 seconds.
 * - Type the character 'c' in 1 second.
 * Constraints:
 * 1 <= word.length <= 100
 * word consists of lowercase English letters.
 */
public class P1974_MinimumTimeToTypeWordUsingSpecialTypewriter {
    //greedy
    public int minTimeToType(String word) {
        int min = 0, pre = 0;
        for (char c : word.toCharArray()) {
            int cur = c - 'a', tmp = cur - pre >= 0 ?  cur - pre : -(cur - pre);
            if (tmp < 13) {
                min += tmp;
            } else {
                min += 26 - tmp;
            }
            pre = cur;
        }
        return min + word.length();
    }
    public static void main(String[] args) {
        P1974_MinimumTimeToTypeWordUsingSpecialTypewriter test = new P1974_MinimumTimeToTypeWordUsingSpecialTypewriter();
        System.out.println("n".charAt(0) - 'a');
        System.out.println(("z".charAt(0) - 'a' > 13) ? 26 - ("z".charAt(0) - 'a') : "z".charAt(0) - 'a');
        System.out.println("expected=5  result=" + test.minTimeToType("abc"));
        System.out.println("expected=7  result=" + test.minTimeToType("bza"));
        System.out.println("expected=34 result=" + test.minTimeToType("zjpc"));
    }
}
