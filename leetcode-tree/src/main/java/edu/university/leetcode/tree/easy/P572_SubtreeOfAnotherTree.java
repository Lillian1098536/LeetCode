package edu.university.leetcode.tree.easy;

import edu.university.leetcode.tree.TreeNode;

/**
 * 572. Subtree of Another Tree
 * Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure
 * and node values of subRoot and false otherwise.
 * A subtree of a binary tree, is a tree that consists of a node in tree and all of this node's descendants.
 * The tree could also be considered as a subtree of itself.
 * Example 1: Input: root = [3,4,5,1,2], subRoot = [4,1,2]
 * Output: true
 *   root 3
 *       /\
 *      4  5  subTree 4
 *     /\            /\
 *    1  2          1  2
 * Example 2: Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
 * Output: false
 * Constraints:
 * The number of nodes in the root tree is in the range [1, 2000].
 * The number of nodes in the subRoot tree is in the range [1, 1000].
 * -104 <= root.val <= 104
 * -104 <= subRoot.val <= 104
 */
public class P572_SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null) return false;
        return isSameTree(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isSameTree(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;
        return t1.val == t2.val && isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right);
    }

    public static void main(String[] args) {
        P572_SubtreeOfAnotherTree test = new P572_SubtreeOfAnotherTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(5);

        TreeNode subTree = new TreeNode(4);
        subTree.left = new TreeNode(1);
        subTree.right = new TreeNode(2);

        System.out.println(test.isSubtree(root, subTree));
    }
}
