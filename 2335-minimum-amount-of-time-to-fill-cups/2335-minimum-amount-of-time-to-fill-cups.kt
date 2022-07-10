class Solution {
    fun fillCups(amount: IntArray): Int {
        val pq = PriorityQueue<Int>(Collections.reverseOrder())
        pq.add(amount[0])
        pq.add(amount[1])
        pq.add(amount[2])
        var finished = false
        var count = 0
        while (!finished) {
            var a = pq.remove()
            if (a <= 0) break
            count++
            var b = pq.remove()
            a--
            b--
            pq.add(a)
            pq.add(b)
        }
        return count 
    }
}