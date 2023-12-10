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
    fun sumNumbers(root: TreeNode?): Int {
        var ans = 0
        fun dfs(node: TreeNode?, previous: Int) {
            if (node == null) return
            val current = node.`val` + previous
            if (node!!.left == null && node!!.right == null) {
                ans += current
                return
            }
            dfs(node!!.left, current * 10)
            dfs(node!!.right, current * 10)
        }
        dfs(root, 0)
        return ans
    }
}