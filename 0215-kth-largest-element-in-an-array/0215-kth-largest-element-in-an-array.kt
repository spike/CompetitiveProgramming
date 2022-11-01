class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val pq = PriorityQueue<Int>(k+1)
        // got my priority queue backwards
        for (n in nums) {
            pq.add(n)
            if (pq.size > k) {
                pq.poll()
            }
        }
        return pq.poll()
    }
}