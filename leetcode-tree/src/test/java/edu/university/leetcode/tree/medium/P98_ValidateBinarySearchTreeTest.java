package edu.university.leetcode.tree.medium;

import static edu.university.leetcode.tree.easy.P100_SameTree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example 1: Input:
 *     8
 *    / \
 *   3   10
 *  / \    \
 * 1   6    14
 *    / \  /
 *   4  7 13
 * Output: true
 * Example 2: Input:
 *     5
 *    / \
 *   1   4
 *  / \
 * 3   6
 Output: false
 */
public class P98_ValidateBinarySearchTreeTest {

    P98_ValidateBinarySearchTree tree = new P98_ValidateBinarySearchTree();

    @Test
    public void isValidBSTtrue() {
        assertTrue(tree.isValidBST(getTrueTree()));
    }

    @Test
    public void isValidBSTtrue2() {
        assertTrue(tree.isValidBST2(getTrueTree()));
    }

    @Test
    public void isValidBSTtrueN() {
        assertTrue(tree.isValidateBSTNonRecursive(getTrueTree()));
    }

    @Test
    public void isValidBSTfalse() {
        assertTrue(!tree.isValidBST(getFlastTree()));
    }

    @Test
    public void isValidBSTfalse2() {
        assertTrue(!tree.isValidBST2(getFlastTree()));
    }

    @Test
    public void isValidBSTfalseN() {
        assertTrue(!tree.isValidateBSTNonRecursive(getFlastTree()));
    }

    private TreeNode getTrueTree() {
        TreeNode t6 = new TreeNode(6);
        t6.left = new TreeNode(4);
        t6.right = new TreeNode(7);
        TreeNode t3 = new TreeNode(3);
        t3.left = new TreeNode(1);
        t3.right = t6;
        TreeNode t8 = new TreeNode(8);
        t8.left = t3;
        TreeNode t10 = new TreeNode(10);
        TreeNode t14 = new TreeNode(14);
        t10.right = t14;
        t14.left = new TreeNode(13);
        t8.right = t10;
        return t8;
    }

    private TreeNode getFlastTree() {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(6);
        TreeNode t5 = new TreeNode(5);
        t5.left = t1;
        t5.right = new TreeNode(4);
        return t5;
    }

}