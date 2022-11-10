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
    var steps = 0
    fun distributeCoins(root: TreeNode?): Int {
        steps = 0
        dfs(root)
        return steps
    }
    fun dfs(root: TreeNode?): Int {
        var balance = 0
        if (root == null) return 0
        var leftBal = dfs(root.left)
        steps += Math.abs(leftBal)
        var rightBal = dfs(root.right)
        steps += Math.abs(rightBal)
        balance = leftBal + rightBal
        balance += root.`val` - 1  
        return balance
    }

}