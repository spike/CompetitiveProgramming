class Solution { 
    fun miceAndCheese(reward1: IntArray, reward2: IntArray, k: Int): Int {
        var count = k
        val pq = PriorityQueue<Array<Int>>(Comparator { a, b ->
            b[3].compareTo(a[3])  // sorting by diff from ascending to descending
        })
        
        for (i in reward1.indices) {
            val arr = arrayOf(i, reward1[i], reward2[i], reward1[i]-reward2[i])
            pq.add(arr)
        }
        var total = 0
        while (pq.isNotEmpty() && count > 0) { // feeding mouse 1
            val node = pq.remove()
            val cheeseType = node[0]
            total += node[1]
            count--
        }
        while (pq.isNotEmpty()) { // feeding mouse 2
            val node = pq.remove()
            total += node[2]
        }
        return total
    }
}