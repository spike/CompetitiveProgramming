class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        val pq = PriorityQueue<Int>(Collections.reverseOrder())
        for (stone in stones) {
            pq.add(stone)
        }
        while (pq.size > 1) {
            val a: Int = pq.remove()
            val b: Int = pq.remove()
            if (a != b) {
                pq.add(a-b)
            } else if (pq.isEmpty()) {
                return 0
            }
        }
        return pq.remove()
    }
}