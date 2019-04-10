package edu.university.leetcode.tree.easy;

import static edu.university.leetcode.tree.easy.P100_SameTree.TreeNode;

import org.junit.Test;

import static org.junit.Assert.*;

public class P653_TwoSumIVInputBSTTest {

    @Test
    public void findTarget() {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(3);
        node.right = new TreeNode(6);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(4);
        node.right.right = new TreeNode(7);
        assertTrue(P653_TwoSumIVInputBST.findTarget(node, 9));
    }

}