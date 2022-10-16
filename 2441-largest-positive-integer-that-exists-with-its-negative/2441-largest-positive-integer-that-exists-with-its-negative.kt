class Solution { 
    fun findMaxK(nums: IntArray): Int {
        val hs = HashSet<Int>()
        val pq = PriorityQueue<Int>(Comparator { a, b ->
            b.compareTo(a)
        })
        for (n in nums) {
            hs.add(n)
            pq.add(n)
        }
        while (!pq.isEmpty()) {
            val biggest = pq.remove()
            if (hs.contains(biggest * -1)) return biggest
        }
        return -1
    }
}