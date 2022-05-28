/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int digit = 0;
        int remainder = 0;
        ListNode current = new ListNode();
        ListNode head = current;
        while (l1 != null || l2 != null || remainder > 0) {
            digit += remainder;
            remainder = 0;
            if (l1 != null) {
                digit += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                digit += l2.val;
                l2 = l2.next;
            }
            remainder = digit / 10;
            digit = digit % 10;
            current.val = digit;
            digit = 0;
            if (l1 != null || l2 != null || remainder > 0) {
                current.next = new ListNode();
                current = current.next;
            }
        }
        return head;
    }
}