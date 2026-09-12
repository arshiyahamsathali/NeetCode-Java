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

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }
    private int height(TreeNode node) {
        // Empty tree is balanced
        if (node == null) {
            return 0;
        }
        // Find height of left subtree
        int leftHeight = height(node.left);
        // If left subtree is unbalanced
        if (leftHeight == -1) {
            return -1;
        }
        // Find height of right subtree
        int rightHeight = height(node.right);
        // If right subtree is unbalanced
        if (rightHeight == -1) {
            return -1;
        }
        // Check current node balance
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        // Return height of current tree
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
