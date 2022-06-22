class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val pq = PriorityQueue<Int>(Collections.reverseOrder())
        for (n in nums) {
            pq.add(n)
        }
        var answer = Integer.MIN_VALUE
        repeat(k) {
            answer = pq.remove().toInt()
        }
        return answer
    }
}