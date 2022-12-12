/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var neighbors: ArrayList<Node?> = ArrayList<Node?>()
 * }
 */

class Solution {
    fun cloneGraph(node: Node?): Node? {
        if (node == null) return null
        val arr = Array<Node?>(101) { null }
        return getClonedNode(node, arr)
    }
    fun getClonedNode(node: Node?, arr: Array<Node?>): Node {
        if (arr[node!!.`val`] != null) return arr[node!!.`val`]!!
        val copy = Node(node.`val`)
        arr[node!!.`val`] = copy
        for (n in node.neighbors) {
            val tempNode = getClonedNode(n, arr)
            copy.neighbors.add(tempNode)
        }
        return copy
    }
}