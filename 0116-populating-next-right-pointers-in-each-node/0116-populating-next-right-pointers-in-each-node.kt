/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var left: Node? = null
 *     var right: Node? = null
 *     var next: Node? = null
 * }
 */

class Solution {
    fun connect(root: Node?): Node? {
        val q1: Queue<Node> = LinkedList<Node>()
        val q2: Queue<Node> = LinkedList<Node>()
        if (root == null) return root
        q1.add(root) 
        var oddLevel = true
        while (q1.isNotEmpty() || q2.isNotEmpty()) {
            if (oddLevel) {
                var prev: Node? = null
                while (q1.isNotEmpty()) {
                    val node = q1.remove()
                    node?.next = prev
                    prev = node
                    if (node!!.right != null) q2.add(node!!.right)
                    if (node!!.left != null) q2.add(node!!.left)
                }
            } else {
                var prev: Node? = null
                while (q2.isNotEmpty()) {
                    val node = q2.remove()
                    node?.next = prev
                    prev = node
                    if (node!!.right != null) q1.add(node!!.right)
                    if (node!!.left != null) q1.add(node!!.left)
                }   
            }
            oddLevel = !oddLevel
        }
        return root
    }
}