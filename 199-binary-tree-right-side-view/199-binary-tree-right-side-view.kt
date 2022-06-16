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
    fun rightSideView(root: TreeNode?): List<Int> {
        val height = height(root, 0)
        val arr = Array(height) {0}
        preorderFill(root, arr, 0)
        return arr.asList()
     }
    fun preorderFill(root: TreeNode?, arr: Array<Int>, level: Int) {
        if (root == null) return
        preorderFill(root.left, arr, level+1)
        arr[level] = root.`val`
        preorderFill(root.right, arr, level+1)
        return
    }
    fun height(root: TreeNode?, depth: Int): Int {
        if (root == null) return depth
        return Math.max(height(root.left, depth+1),
                        height(root.right, depth+1))
    }
}