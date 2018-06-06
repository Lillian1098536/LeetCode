package edu.university.leetcode.tree.medium;

import static edu.university.leetcode.tree.easy.P100_SameTree.TreeNode;

/**
 * 98. Validate Binary Search Tree
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * Assume a BST is defined as follows:
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * Example 1: Input:
 *   2
 *  / \
 * 1   3
 * Output: true
 * Example 2: Input:
 *     5
 *    / \
 *   1   4
 *  / \
 * 3   6
 Output: false
 Explanation: The input is: [5,1,4,null,null,3,6]. The root node's value
 is 5 but its right child's value is 4.
 */
public class P98_ValidateBinarySearchTree {

    private TreeNode lastNode;
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (!isValidBST(root.left)) return false;
        if (lastNode != null && lastNode.val >= root.val) return false;
        lastNode = root;
        if (!isValidBST(root.right)) return false;
        return true;
    }

}
