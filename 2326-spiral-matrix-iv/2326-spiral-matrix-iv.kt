/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun spiralMatrix(m: Int, n: Int, h: ListNode?): Array<IntArray> {
        val mat = Array<IntArray>(m) { IntArray(n) {-1} }
        var head = h
        var maxY = m-1
        var maxX = n-1
        var minY = 0
        var minX = 0
        var x = 0
        var y = 0
        while (minX <= maxX && minY <= maxY) {
            // going right
            for (i in minX..maxX) {
                if (head == null) return mat
                mat[y][i] = head.`val`
                head = head.next
                x = i
            }
            minY++
            // going down
            for (i in minY..maxY) {
                if (head == null) return mat
                mat[i][x] = head.`val`
                head = head.next
                y = i
            }
            maxX--
            // going left
            for (i in maxX downTo minX) {
                if (head == null) return mat
                mat[y][i] = head.`val`
                head = head.next
                x = i
            }
            maxY--
            // going up
            for (i in maxY downTo minY) {
                if (head == null) return mat
                mat[i][x] = head.`val`
                head = head.next
                y = i
            }
            minX++
        }
        return mat
    }
}