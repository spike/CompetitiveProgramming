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
// Assumption: Tree is complete and balanced

// maintain a list of paths [1,0,0], [1,0,1], [1,1,0], []

// use a preorder traversal to build each path recursively

// will use a 32bit Integer to keep track of each path

class Solution {
    val lst: MutableList<Int> = mutableListOf<Int>()
    fun sumRootToLeaf(root: TreeNode?): Int {
        lst.clear()
        helper(root, 0)
        println(lst)
        return lst.fold(0) { acc, item -> acc + item }
    }
    fun helper(root: TreeNode?, n: Int) {
        if (root == null) return
        val num = (n shl 1) + root!!.`val`
        if (root!!.left == null && root!!.right == null) {
            lst.add(num)
            return
        }
        helper(root!!.left, num)
        helper(root!!.right, num)
        return
    }
}