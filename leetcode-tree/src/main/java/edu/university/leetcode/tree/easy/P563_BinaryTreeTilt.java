package edu.university.leetcode.tree.easy;

import edu.university.leetcode.tree.TreeNode;

/**
 * 563. Binary Tree Tilt
 * Given the root of a binary tree, return the sum of every tree node's tilt.
 * The tilt of a tree node is the absolute difference between the sum of all left subtree node values and all right subtree node values.
 * If a node does not have a left child, then the sum of the left subtree node values is treated as 0.
 * The rule is similar if the node does not have a right child.
 * Example 1: Input: root = [1,2,3]
 * Output: 1
 * 1     1
 * /\ -> /\
 * 2  3  0  0
 * Explanation:
 * Tilt of node 2 : |0-0| = 0 (no children)
 * Tilt of node 3 : |0-0| = 0 (no children)
 * Tilt of node 1 : |2-3| = 1 (left subtree is just left child, so sum is 2; right subtree is just right child, so sum is 3)
 * Sum of every tilt : 0 + 0 + 1 = 1
 * Example 2: Input: root = [4,2,9,3,5,null,7]
 * Output: 15
 * 4       6
 * /\      /\
 * 2 9 ->  2  7
 * /\  \   /\   \
 * 3 5  7  0 0    0
 * Explanation:
 * Tilt of node 3 : |0-0| = 0 (no children)
 * Tilt of node 5 : |0-0| = 0 (no children)
 * Tilt of node 7 : |0-0| = 0 (no children)
 * Tilt of node 2 : |3-5| = 2 (left subtree is just left child, so sum is 3; right subtree is just right child, so sum is 5)
 * Tilt of node 9 : |0-7| = 7 (no left child, so sum is 0; right subtree is just right child, so sum is 7)
 * Tilt of node 4 : |(3+5+2)-(9+7)| = |10-16| = 6 (left subtree values are 3, 5, and 2, which sums to 10; right subtree values are 9 and 7, which sums to 16)
 * Sum of every tilt : 0 + 0 + 0 + 2 + 7 + 6 = 15
 * Example 3: Input: root = [21,7,14,1,1,2,2,3,3]
 * Output: 9
 */
public class P563_BinaryTreeTilt {
    public int findTilt(TreeNode root) {
        if (root == null) return 0;
        sum(root);
        return sum(root);
    }


    public int sum(TreeNode root) {
        int left = root.left == null ? 0 : sum(root.left);
        int right = root.right == null ? 0 : sum(root.right);

        int sum = root.val + left + right;
        root.val = left > right ? left - right : right - left;

        return sum;
    }

    public static void main(String[] args) {
        P563_BinaryTreeTilt test = new P563_BinaryTreeTilt();
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        System.out.println(test.findTilt(root1));

        TreeNode root2 = new TreeNode(4);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(5);
        root2.right = new TreeNode(9);
        root2.right.right = new TreeNode(7);
        System.out.println(test.findTilt(root2));

        TreeNode root3 = new TreeNode(21);
        root3.left = new TreeNode(7);
        root3.left.left = new TreeNode(1);
        root3.left.left.left = new TreeNode(3);
        root3.left.left.right = new TreeNode(3);
        root3.left.right = new TreeNode(1);
        root3.right = new TreeNode(14);
        root3.right.left = new TreeNode(2);
        root3.right.right = new TreeNode(2);
        System.out.println(test.findTilt(root3));

    }
}
