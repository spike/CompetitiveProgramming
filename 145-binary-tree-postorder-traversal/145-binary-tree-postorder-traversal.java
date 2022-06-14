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
	List<Integer> lst;
    public List<Integer> postorderTraversal(TreeNode root) {
        lst = new ArrayList();
        dfs(root);
        return lst;
    }
    private void dfs(TreeNode root) {
	    if (root == null) return;
	    dfs(root.left);
	    dfs(root.right);
		lst.add(root.val);
		return;
    }
}