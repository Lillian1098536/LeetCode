package edu.university.leetcode.number.medium;

/**
 * 223. Rectangle Area
 * Find the total area covered by two rectilinear rectangles in a 2D plane.
 * Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
 * Example: Input: A = -3, B = 0, C = 3, D = 4, E = 0, F = -1, G = 9, H = 2 Output: 45
 */
public class P223_RectangleArea {

    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        return (C - A) * (D - B) + (G - E) * (H - F) - helper(A, B, C, D, E, F, G, H);
    }

    private static int helper (int A, int B, int C, int D, int E, int F, int G, int H) {
        int up = Math.min(D, H);
        int down = Math.max(B, F);
        int left = Math.min(C, G);
        int right = Math.max(A, E);
        // Without overlap
        if (up < down || left < right) {
            return 0;
        } else {
            // With overlap
            return (up - down) * (left - right);
        }
    }
}
