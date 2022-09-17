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
    var result = false
    fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
        result = false
        dfs(root, x, y, 0)
        return result
    }
    fun dfs(root: TreeNode?, x: Int, y: Int, level: Int): Int {
        var a = -1; var b = -2
        if (root == null) return -1
        if (root.`val` == x || root.`val` == y) {
            return level
        }
        if (root.left != null) {
            a = dfs(root.left, x, y, level+1)
        }
        if (root.right != null) {
            b = dfs(root.right, x, y, level+1)
        }
        if (a > -1 && a == b) {
            if (a != level+1) result = true
            else return -1
        } 
        if (a > -1) return a
        if (b > -2) return b
        else return -1
    }
}

/*
// third example fails because I didn't unit test my brain for 3rd example
class Solution {
    fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
        val q: Queue<Pair<TreeNode, Int>> = LinkedList<Pair<TreeNode, Int>>()
        if (root != null) q.add(Pair(root, 0))
        var foundLevel = -1
        while (!q.isEmpty()) {
            val pair = q.remove()
            val currentNode = pair.first
            val currentLevel = pair.second
            if (x == currentNode.`val` || y == currentNode.`val`) {
                if (foundLevel >= 0) {
                    if (foundLevel == currentLevel) return true
                    else return false
                } else {
                    foundLevel = currentLevel
                }
            }
            if (currentNode.left != null) q.add(Pair(currentNode.left, currentLevel+1))
            if (currentNode.right != null) q.add(Pair(currentNode.right, currentLevel+1))
        }
        return false
    }
} 
*/