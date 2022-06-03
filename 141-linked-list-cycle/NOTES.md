#### Learning Diary
#### Bad:
​
while (fast != null && fast.next != null) {
fast = fast.next.next;
slow = slow.next;
if (slow == fast) return true;
}
I initially placed the `if (slow == fast) return true;` before iterating over fast and slow. I should have caught that by iterating through the diagram with my pencil.
#### Next time:
Iterate through the diagram using the code with my pencil (or better yet, draw the state of the diagram over and over again for each line of my code)