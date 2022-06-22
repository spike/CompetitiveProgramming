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
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        return helper(root, targetSum, 0)
    }
    fun helper(root: TreeNode?, targetSum: Int, sum: Int): Boolean {
        if (root == null) return false
        val currSum: Int = sum + root!!.`val`
        if (root!!.left == null && root!!.right == null) {
            println(currSum)
            if (currSum == targetSum) return true
        }
        val a = helper(root!!.left, targetSum, currSum)
        val b = helper(root!!.right, targetSum, currSum)
        return (a || b)
    }
}