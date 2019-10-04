package edu.university.leetcode.tree.easy;

import edu.university.leetcode.tree.easy.P100_SameTree.TreeNode;

import org.junit.Test;

import static org.junit.Assert.*;

public class P538_ConvertBSTGreaterTreeTest {

    P538_ConvertBSTGreaterTree tree = new P538_ConvertBSTGreaterTree();

    @Test
    public void convertBST() {
        TreeNode result = tree.convertBST(getTreeNode());
        assertEquals("18", result.val, 18);
        assertEquals("20", result.left.val, 20);
        assertEquals("13", result.right.val, 13);
    }


    private TreeNode getTreeNode() {
        TreeNode t = new TreeNode(5);
        t.left = new TreeNode(2);
        t.right = new TreeNode(13);
        return t;
    }
}