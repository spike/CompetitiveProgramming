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
    fun maxAncestorDiff(root: TreeNode?): Int {
        return dfs(root, root!!.`val`, root!!.`val`)
    }
    fun dfs(root: TreeNode?, min: Int, max: Int): Int {
        if (root == null) return 0
        val v = root.`val`
        val minArg = Math.min(min, v)
        val maxArg = Math.max(max, v)
        var diff = Math.max(v-min, max-v)
        val l = dfs(root.left, minArg, maxArg)
        val r = dfs(root.right, minArg, maxArg)
        diff = Math.max(l, diff)
        diff = Math.max(r, diff)
        return diff
    }
}