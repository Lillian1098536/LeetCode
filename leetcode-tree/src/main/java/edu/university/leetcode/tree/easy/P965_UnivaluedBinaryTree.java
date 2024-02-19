package edu.university.leetcode.tree.easy;

import edu.university.leetcode.tree.TreeNode;

/**
 * 965. Univalued Binary Tree
 * A binary tree is univalued if every node in the tree has the same value.
 * Return true if and only if the given tree is univalued.
 * Example 1: Input: [1,1,1,1,1,null,1] Output: true
 * Example 2: Input: [2,2,2,5,2] Output: false
 * Note:
 * The number of nodes in the given tree will be in the range [1, 100].
 * Each node's value will be an integer in the range [0, 99].
 */
public class P965_UnivaluedBinaryTree {

    public boolean isUnivalTree(TreeNode root) {
        return isUnivalTree(root, root.val);
    }

    public boolean isUnivalTree(TreeNode node, int val) {
        if (node == null) return true;
        return val != node.val ? false : isUnivalTree(node.left, val) && isUnivalTree(node.right, val);
    }

}
