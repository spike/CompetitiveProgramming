class Solution {
    fun pickGifts(gifts: IntArray, k: Int): Long {
        val pq = PriorityQueue<Int>(Comparator { a, b ->
            b.compareTo(a)
        })
        for (g in gifts) {
            pq.add(g)
        }
        var s = k
        while (s > 0) {
            val num = pq.remove()
            pq.add(helper(num))
            s--
        }
        var total = 0L
        while (pq.isNotEmpty()) {
            total += pq.remove()
        }
        return total
    }
    fun helper(n: Int): Int {
        return Math.sqrt(n.toDouble()).toInt() 
    }
}