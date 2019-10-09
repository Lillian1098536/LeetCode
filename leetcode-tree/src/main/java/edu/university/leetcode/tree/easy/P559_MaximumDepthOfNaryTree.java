package edu.university.leetcode.tree.easy;

import java.util.List;

/**
 * 559. Maximum Depth of N-ary Tree
 * Given a n-ary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * For example, given a 3-ary tree:
 * We should return its max depth, which is 3.
 * Note:
 * The depth of the tree is at most 1000.
 * The total number of nodes is at most 5000.
 */
public class P559_MaximumDepthOfNaryTree {

    public int maxDepth(Node root) {
        if (root == null) return 0;
        int max = 0;
        for (Node child : root.children) {
            max = Math.max(max, maxDepth(child));
        }
        return max + 1;
    }

    public static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

}
