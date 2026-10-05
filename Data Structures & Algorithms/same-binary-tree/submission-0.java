/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Case 1:
        // Both nodes are null
        if (p == null && q == null) {
            return true;
        }
        // Case 2:
        // One node is null and the other is not
        if (p == null || q == null) {
            return false;
        }
        // Case 3:
        // Both nodes exist, but their values are different
        if (p.val != q.val) {
            return false;
        }
        // Compare left subtrees
        boolean leftSame = isSameTree(p.left, q.left);
        // Compare right subtrees
        boolean rightSame = isSameTree(p.right, q.right);
        // Both left and right subtrees must be same
        return leftSame && rightSame;
    }
}
