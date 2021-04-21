package edu.university.leetcode.list.medium;

import java.util.List;

/**
 * 251. Flatten 2D Vector
 * Use 2 pointers to hold position.
 * Use hasNext to validate (x,y)  and move x.
 * Use next() to return (x,y) and move it(regardless of correctness, which is determined by hasNext())
 * For example, Given 2d vector =
 * [
 *   [1,2],
 *   [3],
 *   [4,5,6]
 * ]
 * By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,2,3,4,5,6].
 */
public class P251_Flatten2DVector {
    private int x;
    private int y;
    private List<List<Integer>> list;
    public P251_Flatten2DVector(List<List<Integer>> vec2d) {
        if (vec2d == null) return;
        this.x = 0;
        this.y = 0;
        this.list = vec2d;
    }
    public int next() {
        int next = list.get(x).get(y);
        if (y + 1 >= list.get(x).size()) {
            y = 0;
            x++;
        } else {
            y++;
        }
        return next;
    }
    public boolean hasNext() {
        if (list == null) return false;
        while (x < list.size() && list.get(x).size() == 0) {
            x++;
            y--;
        }
        if (x >= list.size()) return false;
        if (y >= list.get(x).size()) return false;
        return true;
    }
}
