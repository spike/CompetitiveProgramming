// Definition for singly-linked list.
// #[derive(PartialEq, Eq, Clone, Debug)]
// pub struct ListNode {
//   pub val: i32,
//   pub next: Option<Box<ListNode>>
// }
// 
// impl ListNode {
//   #[inline]
//   fn new(val: i32) -> Self {
//     ListNode {
//       next: None,
//       val
//     }
//   }
// }
impl Solution {
    pub fn middle_node(mut slow: Option<Box<ListNode>>) -> Option<Box<ListNode>> {
        let mut fast = slow.clone();
        
        while fast.is_some() && fast.as_ref()?.next.is_some() {
            fast = fast?.next?.next;
            slow = slow?.next;
        }
        slow
    }
}