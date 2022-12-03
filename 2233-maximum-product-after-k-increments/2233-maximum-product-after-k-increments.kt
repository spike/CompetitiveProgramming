class Solution {
    fun maximumProduct(nums: IntArray, j: Int): Int {
        val MOD = (Math.pow(10.0, 9.0) + 7.0).toLong()
        var k = j
        var prod = 1L
        // priority queue
        val pq = PriorityQueue<Int>()
        for (n in nums) {
            pq.add(n)
        }
        while(k > 0) {
            val temp = pq.remove() + 1
            pq.add(temp)
            k--
        }
        while(pq.isNotEmpty()) {
            prod = (pq.remove() * prod) % MOD
        }
        
        return (prod % MOD).toInt()
    }
}