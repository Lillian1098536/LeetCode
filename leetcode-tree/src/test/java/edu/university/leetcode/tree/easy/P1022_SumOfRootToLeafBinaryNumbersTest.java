package edu.university.leetcode.tree.easy;

import edu.university.leetcode.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P1022_SumOfRootToLeafBinaryNumbersTest {

    P1022_SumOfRootToLeafBinaryNumbers test = new P1022_SumOfRootToLeafBinaryNumbers();
    @Test
    public void sumRootToLeaf() {
        assertEquals(22, test.sumRootToLeaf(getTreeNode()));
    }

    private TreeNode getTreeNode() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(0);
        t2.left = new TreeNode(0);
        t2.right = new TreeNode(1);
        TreeNode t3 = new TreeNode(1);
        t3.left = new TreeNode(0);
        t3.right = new TreeNode(1);
        t1.left = t2;
        t1.right = t3;
        return t1;
    }
}
