package edu.university.leetcode.tree.easy;

import static edu.university.leetcode.tree.easy.P100_SameTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 144. Binary Tree Preorder Traversal
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 * Example 1: Input: root = [1,null,2,3] Output: [1,2,3]
 *   1
 *    \
 *    2
 *   /
 *  3
 *  Example 2: Input: root = [] Output: []
 * Example 3: Input: root = [1] Output: [1]
 * Constraints:
 * The number of nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class P144_BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversal(result, root);
        return result;
    }

    public void preorderTraversal(List<Integer> result, TreeNode root){
        if (root == null) return;
        result.add(root.val);
        preorderTraversal(result, root.left);
        preorderTraversal(result, root.right);
    }

    public static void main(String[] args) {
        P144_BinaryTreePreorderTraversal test = new P144_BinaryTreePreorderTraversal();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(test.preorderTraversal(root));
    }
}
