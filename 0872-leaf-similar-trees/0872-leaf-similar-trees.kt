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
    var res = true
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        res = true
        val q: Queue<Int> = LinkedList<Int>()
        dfs(root1, q, false)
        dfs(root2, q, true)
        return (res && q.isEmpty())
    }
    fun dfs(root: TreeNode?, q: Queue<Int>,
           check: Boolean) {
        if (root == null) return
        dfs(root.left, q, check)
        if (root.left == null &&
            root.right == null) {
            if (check) {
                if (q.isEmpty() || 
                    q!!.remove() != root.`val`)
                    res = false
            } else {
                q.add(root.`val`)
            }
        } else {
            dfs(root.right, q, check)
        }
    }
}