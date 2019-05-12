package leetcode.com.univalued.binary.tree;

/**
 * A solution for https://leetcode.com/problems/univalued-binary-tree/
 * <p>
 * A binary tree is univalued if every node in the tree has the same value.
 * <p>
 * Return true if and only if the given tree is univalued.
 * <p>
 * Example 1:
 * Input: [1,1,1,1,1,null,1]
 * Output: true
 * <p>
 * Example 2:
 * Input: [2,2,2,5,2]
 * Output: false
 * <p>
 * Note:
 * The number of nodes in the given tree will be in the range [1, 100].
 * Each node's value will be an integer in the range [0, 99].
 */
class Solver {
    boolean globalRes = true;

    boolean isUnivalTree(TreeNode root) {

        checkNode(root, true);

        boolean result = globalRes;
        globalRes = true;
        return result;
    }

    void checkNode(TreeNode node, boolean isUnivalTree) {
        if (isUnivalTree) {
            if (node.left != null) {
                if (node.left.val == node.val) {
                    checkNode(node.left, true);
                } else {
                    checkNode(node.left, false);
                }
            }
            if (node.right != null) {
                if (node.right.val == node.val) {
                    checkNode(node.right, true);
                } else {
                    checkNode(node.right, false);
                }
            }
        } else {
            globalRes = isUnivalTree;
        }
    }
}

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x, TreeNode left, TreeNode right) {
        this.val = x;
        this.left = left;
        this.right = right;
    }
}
