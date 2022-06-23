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
/*
is node found
is subtree identical
*/
class Solution {
    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if (root == null && subRoot == null) return true
        if (root == null || subRoot == null) return false
        val target = subRoot!!.`val`
        if (root!!.`val` == target) {
            if (isTreeSame(root, subRoot)) 
                return true
        }
        return (isSubtree(root!!.left, subRoot) ||
                isSubtree(root!!.right, subRoot))
    }
    fun isTreeSame(root: TreeNode?, root2: TreeNode?): Boolean {
        if (root == null && root2 == null) return true
        if (root == null || root2 == null) return false
        if (root!!.`val` != root2!!.`val`) return false
        return (isTreeSame(root!!.left, root2!!.left) &&
                isTreeSame(root!!.right, root2!!.right))
    }
}