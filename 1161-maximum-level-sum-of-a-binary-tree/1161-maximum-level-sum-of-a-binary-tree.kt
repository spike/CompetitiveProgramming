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
    fun maxLevelSum(root: TreeNode?): Int {
        var maxSum = Integer.MIN_VALUE; var maxLevel = 1
        var currLevel = 0
        val q: Queue<TreeNode> = LinkedList<TreeNode>()
        q.add(root!!)
        while (q.isNotEmpty()) {
            val size = q.size
            var levelSum = 0
            currLevel++
            for (i in 0 until size) {
                val node = q.remove()
                levelSum += node.`val`
                node.left?.let {q.add(it)}
                node.right?.let {q.add(it)}
            }
            if (maxSum < levelSum) {
                maxSum = levelSum
                maxLevel = currLevel
            }
        }
        return maxLevel
    }
}