class Solution {
fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {

    class Node(
        val pos: Int,
        var s: Int,
        var prev: Node? = null,
        var next: Node? = null
    )

    var head: Node? = null
    var tail: Node? = null

    for (i in gas.indices) {
        val n = Node(
            i, gas[i] - cost[i]
        )

        if (tail == null) {
            tail = n
            head = n
        } else {
            tail.next = n
            n.prev = tail
            tail = n
        }
    }

    head?.prev = tail
    tail?.next = head

    var size = gas.size
    var n = head!!

    while (size > 1) {
        if (n.s < 0) {
            n.prev!!.s += n.s
            n.prev!!.next = n.next
            n.next!!.prev = n.prev
            --size
        }
        n = n.prev!!

    }

    return if (n.s >= 0) n.pos else -1
}
}