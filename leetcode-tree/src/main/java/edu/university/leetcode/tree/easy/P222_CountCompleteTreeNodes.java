package edu.university.leetcode.tree.easy;

import edu.university.leetcode.tree.TreeNode;

/**
 * 222. Count Complete Tree Nodes
 * Given the root of a complete binary tree, return the number of the nodes in the tree.
 * According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree,
 * and all nodes in the last level are as far left as possible. It can have between 1 and 2^h nodes inclusive at the last level h.
 * Design an algorithm that runs in less than O(n) time complexity.
 * Example 1: Input: root = [1,2,3,4,5,6] Output: 6
 * Example 2: Input: root = [] Output: 0
 * Example 3: Input: root = [1] Output: 1
 * Constraints: The number of nodes in the tree is in the range [0, 5 * 104].
 * 0 <= Node.val <= 5 * 10^4
 * The tree is guaranteed to be complete.
 */
public class P222_CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public static void main(String[] args) {
        P222_CountCompleteTreeNodes test = new P222_CountCompleteTreeNodes();
        System.out.println(test.countNodes(null));
        System.out.println(test.countNodes(new TreeNode(1)));
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(6);
        System.out.println(test.countNodes(node));
    }
}
