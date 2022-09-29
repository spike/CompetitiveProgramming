class Solution {
    fun thirdMax(nums: IntArray): Int {
        val hs = HashSet<Int>()
        val pq = PriorityQueue<Int>(4)
        for (n in nums) {
            if (hs.add(n)) {
                pq.add(n)
                if (pq.size > 3) pq.remove()
            }
        }
        if (pq.size != 3) {
            var max = Integer.MIN_VALUE
            while(!pq.isEmpty()) {
                max = Math.max(pq.remove(), max)
            }
            return max
        } else {
            return pq.remove()
        }
    }
}