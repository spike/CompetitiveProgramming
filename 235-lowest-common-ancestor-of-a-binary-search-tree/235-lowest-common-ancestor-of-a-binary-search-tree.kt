/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null) return null
        var a: TreeNode? = null
        var b: TreeNode? = null
        if (p!!.`val` < root!!.`val` || q!!.`val` < root!!.`val`) {
            a = lowestCommonAncestor(root.left, p, q)
        }
        if (p!!.`val` > root!!.`val` || q!!.`val` > root!!.`val`) {
            b = lowestCommonAncestor(root.right, p, q)
        }
        if (root!!.`val` == p!!.`val` || root!!.`val` == q!!.`val`) return root
        if (a != null && b != null) {
            return root
        } else {
            if (a != null) return a
            if (b != null) return b
            else return null
        }
    }
}