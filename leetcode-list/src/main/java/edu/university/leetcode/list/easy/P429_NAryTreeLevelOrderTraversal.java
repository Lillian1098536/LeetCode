package edu.university.leetcode.list.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 429. N-ary Tree Level Order Traversal
 * Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * For example, given a 3-ary tree:
 * We should return its level order traversal:
 * [
 *     [1],
 *     [3,2,4],
 *     [5,6]
 * ]
 * Note:
 * The depth of the tree is at most 1000.
 * The total number of nodes is at most 5000.
 */
public class P429_NAryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                list.add(node.val);
                for (Node child : node.children) {
                    queue.offer(child);
                }
            }
            result.add(list);
        }
        return result;
    }



    public static class Node {
        public int val;
        public List<Node> children;

        public Node() { }

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }
}
