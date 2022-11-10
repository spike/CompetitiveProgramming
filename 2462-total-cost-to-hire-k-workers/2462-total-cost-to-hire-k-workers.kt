class Solution { /*
costs = [17,12,10,2,7,2,11,20,8], k = 3, candidates = 4
2,
2,
7?

[1,2,4,1], k = 3, candidates = 3
1,
1,
2

[31,25,72,79,74,65,84,91,18,59,27,9,81,33,17,58] 2 candidates
[     ]                               [        ]
17

double deque for original data
two priority queues for each side of size candidates
*/
    
        // [1,2,4,1] k = 3, candidates = 3
    fun totalCost(costs: IntArray, k: Int, candidates: Int): Long {
        val deque: Deque<Int> = LinkedList<Int>()
        val leftPQ = PriorityQueue<Int>(candidates)
        val rightPQ = PriorityQueue<Int>(candidates)
        for (cost in costs) {
            deque.addLast(cost)
        }  // deque = [1,2,4,1]
        var n = k; var sum = 0L
        while (n > 0) {  // 2
            n--
            while (leftPQ.size < candidates && deque.isNotEmpty()) {
                leftPQ.offer(deque.pollFirst())
            } // leftPQ = 2
            while (rightPQ.size < candidates && deque.isNotEmpty()) {
                rightPQ.offer(deque.pollLast())
            } // rightPQ = 4
            
            if (leftPQ.isEmpty() && rightPQ.isEmpty()) return sum
            if (leftPQ.isEmpty()) {
                sum += rightPQ.poll()
                continue
            } else if (rightPQ.isEmpty()) {
                sum += leftPQ.poll()
                continue
            }
            if (leftPQ.isNotEmpty() && rightPQ.isNotEmpty() &&
                leftPQ.peek() <= rightPQ.peek()) { // 2 <= 4 true
                
                sum += leftPQ.poll()
                // sum = 1+1+2
            } else {
                sum += rightPQ.poll()
                // sum = 1+1
            }
              // n = 0
        } 
        return sum
    }
}