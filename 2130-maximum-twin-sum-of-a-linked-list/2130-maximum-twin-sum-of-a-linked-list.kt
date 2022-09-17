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
    // [5,4,2,1]
    fun pairSum(head: ListNode?): Int { // 5
	    var max = 0
	    var midSize = 0
	    val lst = mutableListOf<Int>()
        var slow: ListNode? = head
        var fast: ListNode? = head
	    while (fast != null && fast.next != null) {
            // 5
		    lst.add(slow!!.`val`) // [5, 4]
			slow = slow.next!!  // 2 node
			fast = fast.next!!.next  // null
			midSize++  // 2
	    }
	    var i = 0
	    for (i in 0 until midSize) { //  1
            if (slow == null) return max
		    val sum = lst.get(lst.lastIndex-i) + slow.`val`
            max = Math.max(sum, max) // 7
		    slow = slow.next // 1 node
	    }
	    return max
    }
}