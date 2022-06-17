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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<>();
        if (root == null) return lst;
        
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while(!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> sublist = new ArrayList();
            System.out.println(q.size());
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.remove();
                sublist.add(node.val);
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            lst.add(sublist);
        }
        return lst;
    }
}









