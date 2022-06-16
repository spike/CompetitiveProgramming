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
        // to simplify the logic, do no checking
        // just do a normal left-to-right pre-order 
        // and overwrite the array list index by index
        
        //keep track of the current level/index of the array
        // with a helper function
        
        // actually do a normal inorder to reduce the number of
        // times the array list needs to get resized. 
    public List<Integer> rightSideView(TreeNode root) {
        int maxDepth = findMaxDepth(root, 0);
        Integer[] arr = new Integer[maxDepth];
        dfs(root, 0, arr);
        return Arrays.asList(arr);
    }
    private int findMaxDepth(TreeNode root, int depth) {
        if (root == null) return depth;
        return Math.max(findMaxDepth(root.left, depth+1),
                        findMaxDepth(root.right, depth+1));
    }
    void dfs(TreeNode root, int level, Integer[] arr) {
        if (root == null) return;
        dfs(root.left, level + 1, arr);
        arr[level] = root.val;
        dfs(root.right, level + 1, arr);    
        return;
    }
}






