package edu.university.leetcode.matrix.easy;

/**
 * 832. Flipping an Image
 * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 * For example, inverting [0,1,1] results in [1,0,0].
 * Example 1: Input: image = [[1,1,0],[1,0,1],[0,0,0]] * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 * Example 2: Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]] Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Constraints:
 * n == image.length
 * n == image[i].length
 * 1 <= n <= 20
 * images[i][j] is either 0 or 1.
 */
public class P832_FlippingAnImage {
    /**
     * double pointer
     * AND 1 & 1 = 1    0 & 0 = 0   0 & 1 = 0
     * OR  0 | 0 = 0    0 | 1 = 1   0 | 1 = 1
     * XOR 0 ^ 1 = 1    0 ^ 0 = 0   1 ^ 1 = 0
     * NOR ~0 = 1       ~1 = 0
     * @param image
     * @return
     */
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            int l = 0, r = n - 1;
            while (l < r) {
                if (image[i][l] == image[i][r]) {
                    image[i][l] ^= 1;
                    image[i][r] ^= 1;
                }
                l++;
                r--;
            }
            if (l == r) {
                image[i][l] ^= 1;
            }
        }
        return image;
    }

    public int[][] flipAndInvertImageMore(int[][] image) {
        int[][] result = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            int len = image[i].length, j = 0;
            int[] update = new int[len];
            while (j < len / 2) {
                update[j] = invert(image[i][len - j - 1]);
                update[len - j - 1] = invert(image[i][j]);
                j++;
            }
            if (j == len / 2) {
                update[j] = invert(image[i][len - j - 1]);
            }
            result[i] = update;
        }
        return result;
    }

    private int invert(int n) {
        return n == 0 ? 1 : 0;
    }

    private void swap(int m, int n) {
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
    }

}
