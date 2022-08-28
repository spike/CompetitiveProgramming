// ankify init { }
class KthLargest(val k: Int, nums: IntArray) { 
    val pq = PriorityQueue<Int>(k+1)
    init {
        for (n in nums) {
            add(n)
        }
    }
    fun add(v: Int): Int {
        pq.offer(v)
        if (pq.size > k) pq.poll()
        return pq.peek()
    } 
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * var obj = KthLargest(k, nums)
 * var param_1 = obj.add(`val`)
 */