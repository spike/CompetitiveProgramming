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
    int m;
    public int diameterOfBinaryTree(TreeNode root) {
        m = 0; // global maximum
        postOrderDFS(root); // return height of tree
        return m;
    }
    private int postOrderDFS(TreeNode root) {
        if (root == null) return 0;
        int left = postOrderDFS(root.left); // height of left subtree
        int right = postOrderDFS(root.right); // height of right subtree
        int tallestSubtreeHeight = Math.max(left, right);
        
        m = Math.max(left+right, m);
        // updating global maximum in case left+right is long enough
        // note the absence of the trunk of the tree, I'm just counting the 
        
        int height = tallestSubtreeHeight + 1; 
        // add current node to height
        // this is where the postorder magic happens
        // remove that + 1 and you'll get zero every time
        return height;
    }
       
}





