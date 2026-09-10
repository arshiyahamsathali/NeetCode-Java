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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }
    public int height(TreeNode root) {
        // No node
        if (root == null) {
            return 0;
        }
        // Find height of left side
        int left = height(root.left);
        // Find height of right side
        int right = height(root.right);
        // Path passing through current node
        diameter = Math.max(diameter, left + right);
        // Return height of current node
        return 1 + Math.max(left, right);
    }
}