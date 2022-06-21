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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hs = new HashSet();
        return helper(root, k, hs);
    }
    private boolean helper(TreeNode root, int k, HashSet<Integer> hs) {
        if (root == null) return false;
        int num = root.val;
        int comp = k - num;
        if (hs.contains(num)) {
            return true;
        } else {
            hs.add(comp);
        }
        boolean a = helper(root.left, k, hs);
        boolean b = helper(root.right, k, hs);
        return (a || b);
    }
}