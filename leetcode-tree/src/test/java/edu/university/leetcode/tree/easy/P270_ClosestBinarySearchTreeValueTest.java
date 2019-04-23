package edu.university.leetcode.tree.easy;

import static edu.university.leetcode.tree.easy.P100_SameTree.TreeNode;
import static org.junit.Assert.*;

import org.junit.Test;

public class P270_ClosestBinarySearchTreeValueTest {

    @Test
    public void closestValue() {
        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(5);
        root.right = new TreeNode(11);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(6);
        assertEquals(5, P270_ClosestBinarySearchTreeValue.closestValue(root, 4.1));
    }
}