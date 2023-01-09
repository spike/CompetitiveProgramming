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
    val result = mutableListOf<Int>()
    fun preorderTraversal(root: TreeNode?): List<Int> {
        if (root != null) {
            result.add(root.`val`)
            preorderTraversal(root.left)
            preorderTraversal(root.right)
        }
        return result
    }
}