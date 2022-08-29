class Solution {
    fun minStoneSum(piles: IntArray, k: Int): Int {
        var countDown = k
        val pq = PriorityQueue<Int>(Collections.reverseOrder())
        var total = 0
        for (p in piles) {    
            pq.offer(p)
            total += p
        }
        while (pq.isNotEmpty() && countDown > 0) {
            val biggest = pq.remove()
            val newPile: Int = biggest - (biggest/2)
            total -= biggest/2
            if (newPile > 0) pq.offer(newPile)
            countDown--
        }
        return total
    }
}