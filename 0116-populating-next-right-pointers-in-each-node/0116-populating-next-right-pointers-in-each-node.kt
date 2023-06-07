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
        var q1: Queue<Node> = LinkedList<Node>()
        var q2: Queue<Node> = LinkedList<Node>()
        if (root == null) return root
        q1.add(root) 
        while (q1.isNotEmpty() || q2.isNotEmpty()) {
            var prev: Node? = null
            while (q1.isNotEmpty()) {
                val node = q1.remove()!!
                node.next = prev
                prev = node
                if (node.right != null) q2.add(node.right)
                if (node.left != null) q2.add(node.left)
            }
            q1 = q2.also{ q2 = q1 }
        }
        return root
    }
}