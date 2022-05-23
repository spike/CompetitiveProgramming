class Solution {
    fun countStudents(students: IntArray, sandwiches: IntArray): Int {
        val stack: Deque<Int> = ArrayDeque<Int>()
        val queue: Deque<Int> = ArrayDeque<Int>()
        for (item in sandwiches) {
            stack.addLast(item)
        }
        for (student in students) {
            queue.addLast(student)
        }
        var limit = 10001
        while (limit > 0 && 
               stack.size > 0 && queue.size > 0) {
            if (queue.peekFirst() == stack.peekFirst()) {
                queue.removeFirst();
                stack.removeFirst();
            } else {
                queue.addLast(queue.removeFirst())
            }
            limit--
        }
        return queue.size
    }
}