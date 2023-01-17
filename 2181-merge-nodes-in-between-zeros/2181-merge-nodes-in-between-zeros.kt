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
    fun mergeNodes(head: ListNode?): ListNode? {
        var curr=head
        var prev:ListNode?=null
        var lastnode:ListNode?=null
        while(curr!=null){
            var count=0
            prev=curr
            curr=curr.next
            while(curr!=null&&curr.`val`!=0){
                count+=curr!!.`val`
                curr=curr!!.next
            }
            if(count==0){
                lastnode?.next=null
                break
            }else{
                prev.`val`=count
                prev.next=curr
                lastnode=prev
            }
        }
        return head
        
    }
}