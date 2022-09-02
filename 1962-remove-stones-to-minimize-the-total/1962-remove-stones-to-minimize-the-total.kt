class Solution {
    /*
    [5,4,9], k = 2    total = 18
    9- (9/2)= 5
    [5,4,5]
    5 - (5/2)=3
    [3,4,5] = 12

    */
    
    fun minStoneSum(piles: IntArray, k: Int): Int {
        var countDown = k
        val pq = PriorityQueue<Int>(Collections.reverseOrder())
        var total = 0
        for (p in piles) {    
            pq.offer(p)
            total += p
        }
        // [5,4,9]
        // [9,5,4]
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