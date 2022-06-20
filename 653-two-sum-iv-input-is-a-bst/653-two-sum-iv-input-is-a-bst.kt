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
    fun findTarget(root: TreeNode?, k: Int): Boolean {
        val compSet = mutableSetOf<Int>()
        return helper(root, k, compSet)
    }
    fun helper(root: TreeNode?, k: Int, compSet: MutableSet<Int>): Boolean {
        if (root == null) return false
        val num = root!!.`val`
        val comp = k-num
        if (num in compSet) {
            return true 
        } else {
            compSet.add(comp)
        }
        val a = (helper(root!!.left, k, compSet))
        val b = (helper(root!!.right, k, compSet))
      return (a || b)
    }
}