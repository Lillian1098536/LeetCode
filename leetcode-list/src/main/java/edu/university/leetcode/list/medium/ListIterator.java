package edu.university.leetcode.list.medium;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 2D List Iterator
 * similar LeetCode questions
 * 251. Flatten 2D Vector
 * 341. Flatten Nested List Iterator
 */
public class ListIterator implements Iterator<Integer> {
    private Iterator<List<Integer>> rowIter;
    private Iterator<Integer> colIter;
    public ListIterator(List<List<Integer>> vec2d) {
        rowIter = vec2d.iterator();
        colIter = Collections.emptyIterator();
    }
    @Override
    public boolean hasNext() {
        while ((colIter == null || !colIter.hasNext()) && rowIter.hasNext()) {
            colIter = rowIter.next().iterator();
        }
        return colIter != null && colIter.hasNext();
    }

    @Override
    public Integer next() {
        return colIter.next();
    }

    @Override
    public void remove() {
        while (colIter == null && rowIter.hasNext()) {
            colIter = rowIter.next().iterator();
        }
        if (colIter != null) {
            colIter.remove();
        }
    }
}
