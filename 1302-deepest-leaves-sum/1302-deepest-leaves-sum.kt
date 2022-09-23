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
    fun deepestLeavesSum(root: TreeNode?): Int {
        val q: Queue<TreeNode> = LinkedList<TreeNode>()
        var sum = 0;                    
        if (root != null) q.offer(root)
        while (!q.isEmpty()) {
            sum = 0  // reset 0 at the current level
            for (i in 0 until q.size) {
                val node = q.poll()
                val num = node.`val`
                sum += num
                if (node.left != null) q.offer(node.left)
                if (node.right != null) q.offer(node.right)
            }
        }
        return sum
    }
}


/*
class Solution {
    fun deepestLeavesSum(root: TreeNode?): Int {
        val q: Queue<Pair<TreeNode,Int>> = LinkedList<Pair<TreeNode,Int>>()
        var sum = 0; var previousLevel = 0                     
        if (root != null) q.add(Pair(root, 0))
        while (!q.isEmpty()) {
            val pair = q.remove()
            val node = pair.first
            val num = node.`val`
            val currentLevel = pair.second
            if (currentLevel > previousLevel) {
                sum = 0
                previousLevel = currentLevel
            }
            sum += num
            if (node.left != null) q.add(Pair(node.left, currentLevel+1))
            if (node.right != null) q.add(Pair(node.right, currentLevel+1))
        }
        return sum
    }
} */