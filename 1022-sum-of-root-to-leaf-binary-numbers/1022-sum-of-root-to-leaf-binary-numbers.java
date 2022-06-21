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
    ArrayList<Integer> lst;
    public int sumRootToLeaf(TreeNode root) {
        lst = new ArrayList();
        helper(root, 0);
        int total = 0;
        for (int i = 0; i < lst.size(); i++) {
            total += lst.get(i);
        }
        return total;
    }
    private void helper(TreeNode root, int n) {
        if (root == null) return;
        int num = (n << 1) + root.val;
        if (root.left == null && root.right == null) {
            lst.add(num);
            return;
        }
        helper(root.left, num);
        helper(root.right, num);
        return;
    }
 }
