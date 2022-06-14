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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
	    TreeNode subtree1 = root.left;
	    TreeNode subtree2 = root.right;
	    return preorderInvCheck(subtree1, subtree2);
    }
    boolean preorderInvCheck(TreeNode t1, TreeNode t2) {
	    if (t1 == null && t2 == null) return true;
	    if (t1 == null || t2 == null) return false;
	    if (t1.val != t2.val) return false;
	    boolean left = preorderInvCheck(t1.left, t2.right);
	    boolean right = preorderInvCheck(t1.right, t2.left);
	    return left && right;
    }
}










