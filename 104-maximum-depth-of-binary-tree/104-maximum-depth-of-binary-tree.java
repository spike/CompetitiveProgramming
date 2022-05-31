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
    int max;
    public int maxDepth(TreeNode root) {
        max = 0;
        maxDepth(root, 1);
        return max;
    }
    public void maxDepth(TreeNode root, int depth) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            max = Math.max(max, depth);
        }
        maxDepth(root.left, depth+1);
        maxDepth(root.right, depth+1);
        return;
    }
}