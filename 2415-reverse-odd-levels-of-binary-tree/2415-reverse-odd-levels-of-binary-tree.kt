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

//  1
// 2  3

class Solution {
    fun reverseOddLevels(root: TreeNode?): TreeNode? {
        val hm = HashMap<Int, Queue<Int>>()
        ldfs(root, 0, hm)
        rdfs(root, 0, hm)
        return root
    }
    fun ldfs(root: TreeNode?, level: Int, hm: HashMap<Int, Queue<Int>>) { 
        if (root == null) return
        if (root.left != null) ldfs(root.left, level+1, hm) 
        if (level % 2 == 1) {
            // map.getOrPut(key) { mutableListOf() }.add(value)
            hm.getOrPut(level) {LinkedList<Int>()}!!.add(root.`val`)
        }
        if (root.right != null) ldfs(root.right, level+1, hm) 
        return
    }
    fun rdfs(root: TreeNode?, level: Int, hm: HashMap<Int, Queue<Int>>) {
        if (root == null) return
        if (root.right != null) rdfs(root.right, level+1, hm)
        if (level % 2 == 1) {
            root.`val` = hm.get(level)!!.remove()
        }
        if (root.left != null) rdfs(root.left, level+1, hm)
        return
    }

}