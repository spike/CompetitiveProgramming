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
    var sum = 0
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        sum = 0
        dfs(root, low, high)
        return sum
    }
    fun dfs(root: TreeNode?, low: Int, high: Int) {
        if (root == null) return
        val v = root.`val`
        if (v >= low && v <= high) sum += v
        if (v > low) dfs(root.left, low, high)
        if (v < high) dfs(root.right, low, high)
    }
}