/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        TreeNode a = null;
        TreeNode b = null;
        if (p.val < root.val || q.val < root.val) {
            a = lowestCommonAncestor(root.left, p, q);
        }
        if (p.val > root.val || q.val > root.val) {
            b = lowestCommonAncestor(root.right, p, q);
        }
        if (root.val == p.val || root.val == q.val) return root;
        if (a != null && b != null) {
            return root;
        } else {
            if (a != null) return a;
            if (b != null) return b;
            else return null;
        }
    }
}