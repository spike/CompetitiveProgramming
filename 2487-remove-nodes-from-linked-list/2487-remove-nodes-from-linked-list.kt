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
    var max = Integer.MIN_VALUE
    fun removeNodes(head: ListNode?): ListNode? {
        max = Integer.MIN_VALUE
        return traverse(head)
    }
    fun traverse(head: ListNode?): ListNode? {
        if (head == null) return null
        if (head.next == null) {
            max = Math.max(head.`val`, max)
            return head
        }
        head.next = traverse(head.next)
        if (head.`val` < max) {
            max = Math.max(head.`val`, max)
            return head.next
        } else {
            max = Math.max(head.`val`, max)
            return head
        }
    }
}