class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        Deque<Integer> queue = new ArrayDeque<Integer>();
        for (var item : sandwiches) {
            stack.addLast(item);
        }
        for (var student : students) {
            queue.addLast(student);
        }
        int limit = 10001;
        while (limit > 0 && 
               stack.size() > 0 && queue.size() > 0) {
            if (queue.peekFirst() == stack.peekFirst()) {
                queue.removeFirst();
                stack.removeFirst();
            } else {
                queue.addLast(queue.removeFirst());
            }
            limit--;
        }
        return queue.size();
    }
}