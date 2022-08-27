// ankify init { }
class KthLargest(val k: Int, nums: IntArray) { 
    val pq = PriorityQueue<Int>(k)
    init {
        for (n in nums) {
            this.add(n)
        }
    }
    fun add(v: Int): Int {
        if (pq.isEmpty() || pq.size < k || pq.peek() < v) {
            pq.add(v)
            if (pq.size > k) pq.remove()
        }
        return pq.peek()
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * var obj = KthLargest(k, nums)
 * var param_1 = obj.add(`val`)
 */