package edu.university.leetcode.tree.easy;

/**
 * 427. Construct Quad Tree
 * We want to use quad trees to store an N x N boolean grid. Each cell in the grid can only be true or false.
 * The root node represents the whole grid. For each node,
 * it will be subdivided into four children nodes until the values in the region it represents are all the same.
 * Each node has another two boolean attributes : isLeaf and val. isLeaf is true if and only if the node is a leaf node.
 * The val attribute for a leaf node contains the value of the region it represents.
 * Your task is to use a quad tree to represent a given grid.
 * Note: N is less than 1000 and guaranteed to be a power of 2.
 * input
 * [
 *     [1,1,1,1,0,0,0,0],
 *     [1,1,1,1,0,0,0,0],
 *     [1,1,1,1,1,1,1,1],
 *     [1,1,1,1,1,1,1,1],
 *     [1,1,1,1,0,0,0,0],
 *     [1,1,1,1,0,0,0,0],
 *     [1,1,1,1,0,0,0,0],
 *     [1,1,1,1,0,0,0,0]
 * ]
 * output
 * {
 *     "$id":"1",
 *     "val":true,
 *     "isLeaf":false,
 *     "topLeft":{
 *         "$id":"2",
 *         "val":true,
 *         "isLeaf":true,
 *         "topLeft":null,
 *         "topRight":null,
 *         "bottomLeft":null,
 *         "bottomRight":null
 *     },
 *     "topRight":{
 *         "$id":"3",
 *         "val":true,
 *         "isLeaf":false,
 *         "topLeft":{
 *             "$id":"4",
 *             "bottomLeft":null,
 *             "bottomRight":null,
 *             "isLeaf":true,
 *             "topLeft":null,
 *             "topRight":null,
 *             "val":false
 *         },
 *         "topRight":{
 *             "$id":"5",
 *             "val":false
 *             "isLeaf":true,
 *             "topLeft":null,
 *             "topRight":null,
 *             "bottomLeft":null,
 *             "bottomRight":null
 *         },
 *         "bottomLeft":{
 *             "$id":"6"
 *             "val":true,
 *             "isLeaf":true,
 *             "topLeft":null,
 *             "topRight":null,
 *             "bottomLeft":null,
 *             "bottomRight":null,
 *         },
 *         "bottomRight":{
 *             "$id":"7",
 *             "val":true,
 *             "isLeaf":true,
 *             "bottomLeft":null,
 *             "topLeft":null,
 *             "topRight":null,
 *             "bottomRight":null
 *         }
 *     },
 *     "bottomLeft":{
 *         "$id":"8",
 *         "val":true,
 *         "isLeaf":true,
 *         "topLeft":null,
 *         "topRight":null,
 *         "bottomLeft":null,
 *         "bottomRight":null
 *     },
 *     "bottomRight":{
 *         "$id":"9",
 *         "val":false,
 *         "isLeaf":true,
 *         "topLeft":null,
 *         "topRight":null,
 *         "bottomLeft":null,
 *         "bottomRight":null
 *     }
 * }
 */
public class P427_ConstructQuadTree {

    public Node construct(int[][] grid) {
        if (grid.length == 0) return null;
        return dfs(grid, 0, 0, grid.length);
    }

    private Node dfs(int[][] grid, int x, int y, int len) {
        if (len == 1) return new Node(grid[x][y] == 1 ? true : false, true, null, null, null, null);
        len /= 2;
        Node topLeft = dfs(grid, x, y, len);
        Node topRight = dfs(grid, x, y + len, len);
        Node bottomLeft = dfs(grid, x + len, y, len);
        Node bottomRight = dfs(grid, x + len, y + len, len);
        if (topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf &&
        topLeft.val == topRight.val && topRight.val == bottomLeft.val && bottomLeft.val == bottomRight.val) {
            boolean v = topLeft.val;
            return new Node(v, true, null, null, null, null);
        } else {
            Node node = new Node(true, false,null, null, null, null);
            node.topLeft = topLeft;
            node.topRight = topRight;
            node.bottomLeft = bottomLeft;
            node.bottomRight = bottomRight;
            return node;
        }
    }

    public static class Node{
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;
        public Node() {}
        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }
}
