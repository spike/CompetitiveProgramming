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
    var min = Integer.MAX_VALUE
    var lastValue = Integer.MAX_VALUE
    fun getMinimumDifference(root: TreeNode?): Int {
        min = Integer.MAX_VALUE
        lastValue = Integer.MAX_VALUE
        helper(root)
        return min
    }
    fun helper(root: TreeNode?) {
        if (root == null) return
        helper(root.left)
        min = minOf(min, Math.abs(lastValue-root.`val`))
        lastValue = root.`val`
        helper(root.right)
        return
    }
}