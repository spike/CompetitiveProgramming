/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    var maxLength: Int = 0;
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        maxLength = 0
        postOrderDFS(root) // height of tree
        return maxLength
    }
    private fun postOrderDFS(root: TreeNode?): Int {
        if (root == null) return 0
        val left = postOrderDFS(root.left) // height of left subtree
        val right = postOrderDFS(root.right) // height of right subtree
        
        maxLength = Math.max(left+right, maxLength)
        
        val tallestSubtree = Math.max(left, right)
        return tallestSubtree + 1
    }
}