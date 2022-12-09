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
    var maxDiff = 0
    fun maxAncestorDiff(root: TreeNode?): Int {
        maxDiff = 0
        dfs(root, root!!.`val`, root!!.`val`)
        return maxDiff
    }
    fun dfs(root: TreeNode?, min: Int, max: Int) {
        if (root == null) return
        val v = root.`val`
        val minArg = Math.min(min, v)
        val maxArg = Math.max(max, v)
        var diff = Math.abs(minArg - maxArg)
        maxDiff = Math.max(diff, maxDiff)
        dfs(root.left, minArg, maxArg)
        dfs(root.right, minArg, maxArg)
    }
}