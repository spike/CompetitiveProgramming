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
    val hm = HashMap<Int,Int>()
    var maxFreq = 0
    fun findMode(root: TreeNode?): IntArray {
        val lst = mutableListOf<Int>()
        hm.clear()
        dfs(root)
        hm.forEach { k, v ->
            if (v == maxFreq) lst.add(k)
        }
        return lst.toIntArray()
    }
    fun dfs (root: TreeNode?) {
        if (root == null) return
        val n = root.`val`
        val freq = hm.getOrDefault(n, 0) + 1
        hm[n] = freq
        maxFreq = Math.max(freq, maxFreq)
        if (root.left != null) dfs(root.left)
        if (root.right != null) dfs(root.right)
    }
}