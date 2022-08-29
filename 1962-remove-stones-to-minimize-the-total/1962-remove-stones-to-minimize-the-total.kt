class Solution {
    fun minStoneSum(piles: IntArray, k: Int): Int {
        var countDown = k
        val pq = PriorityQueue<Int>(Collections.reverseOrder())
        for (p in piles) {    
            pq.offer(p)
        }
        while (pq.isNotEmpty() && countDown > 0) {
            val biggest = pq.remove()
            val newPile: Int = biggest - (biggest/2)
            if (newPile > 0) pq.offer(newPile)
            countDown--
        }
        var total = 0
        while (pq.isNotEmpty()) {
            total += pq.remove()
        }
        return total
    }
}