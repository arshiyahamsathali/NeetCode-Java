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
    // Checks whether two trees are exactly the same
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Both nodes are null
        if (p == null && q == null) return true;
        // Only one node is null
        if (p == null || q == null)  return false;
        // Values are different
        if (p.val != q.val) return false;
        // Both left and right subtrees must be same
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    // Checks whether subRoot exists inside root
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // No tree means no subtree
        if (root == null) return false;
        // Check if current tree is exactly same as subRoot
        if (isSameTree(root, subRoot)) return true;
        // Search in left or right subtree
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
