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
    Queue<Integer> q;
    public TreeNode increasingBST(TreeNode root) {
        q = new LinkedList();
        inorderDFS(root);
        return postorder();
    }
    private TreeNode inorderDFS(TreeNode root) {
        if (root == null) return null;
        inorderDFS(root.left);
        q.add(root.val);
        inorderDFS(root.right);
        return root;
    }
    private TreeNode postorder() {
        if (q.isEmpty()) return null;
        int n = q.remove();
        return new TreeNode(n, null, postorder());
    } 
}