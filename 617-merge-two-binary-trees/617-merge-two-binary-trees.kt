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
    fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        if (root1 == null && root2 == null) return null;
        var node = TreeNode()
        if (root1 != null && root2 != null) {
            node.`val` = root1.`val` + root2.`val`
            node.left = mergeTrees(root1.left, root2.left)
            node.right = mergeTrees(root1.right, root2.right)
            return node
        }
        if (root1 == null) {
            node.`val` = root2!!.`val`
            node.left = mergeTrees(null, root2!!.left)
            node.right = mergeTrees(null, root2!!.right)
        }
        if (root2 == null)  {
            node.`val` = root1!!.`val`
            node.left = mergeTrees(root1!!.left, null)
            node.right = mergeTrees(root1!!.right, null)
        }
        return node
    }
}