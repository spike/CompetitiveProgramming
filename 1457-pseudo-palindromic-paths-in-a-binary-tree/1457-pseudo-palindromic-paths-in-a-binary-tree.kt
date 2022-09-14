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
    var count = 0
    fun pseudoPalindromicPaths (root: TreeNode?): Int {
        count = 0
        dfs(root, 0)
        return count
    }
    fun dfs(root: TreeNode?, oldPath: Int) {
        if (root == null) return
        val path = (1 shl root.`val`) xor oldPath
        if (root.left == null && root.right == null) {
            if (path == 0 || (path and (path-1)) == 0) count++
            return
        }
        if (root.left != null) dfs(root.left, path)
        if (root.right != null) dfs(root.right, path)
        return
    }
}