package edu.university.leetcode.tree.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static edu.university.leetcode.tree.easy.P100_SameTree.TreeNode;

/**
 * 501. Find Mode in Binary Search Tree
 * Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.
 * Assume a BST is defined as follows:
 * The left subtree of a node contains only nodes with keys less than or equal to the node's key.
 * The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * For example:
 * Given BST [1,null,2,2],
 *    1
 *     \
 *      2
 *     /
 *    2
 * return [2].
 * Note: If a tree has more than one mode, you can return them in any order.
 * Follow up: Could you do that without using any extra space? (Assume that the implicit stack space incurred due to recursion does not count).
 */
public class P501_FindModeInBinarySearchTree {

    private Map<Integer, Integer> map;
    private int max = 0;

    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];
        map = new HashMap<>();
        inorder(root);
        List<Integer> list = new ArrayList<>();
        for (int key : map.keySet()) {
            if (max == map.get(key)) list.add(key);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private void inorder(TreeNode node) {
        if (node.left != null) inorder(node.left);
        map.put(node.val, map.getOrDefault(node.val, 0) + 1);
        max = Math.max(max, map.get(node.val));
        if (node.right != null) inorder(node.right);
    }


}
