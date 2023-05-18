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
    var total = 0
    fun sumEvenGrandparent(root: TreeNode?): Int {
        total = 0
        postorderDfs(root, false, false)
        return total
    }
    fun postorderDfs(root: TreeNode?, 
                        evenParent: Boolean, 
                        evenGrandparent: Boolean) {
        if (root == null) return
        val v = root.`val`
        if (evenGrandparent) total += v
        val even = (v%2 == 0) 
        if (root!!.left != null) {
            postorderDfs(root!!.left, even, evenParent)
        }
        if (root!!.right != null) {
            postorderDfs(root!!.right, even, evenParent)
        }
    }
}