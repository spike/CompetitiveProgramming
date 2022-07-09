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
    fun evaluateTree(root: TreeNode?): Boolean {
        if (root!!.`val` == 0) return false
        if (root.`val` == 1) return true
        val l = evaluateTree(root.left)
        val r = evaluateTree(root.right)
        if (root.`val` == 2) { // ||
            return l || r
        } else { // == 1
            return l && r
        }
    }
}