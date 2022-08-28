class Solution {
    fun garbageCollection(garbage: Array<String>, travel: IntArray): Int {
        val h = Array(garbage.size) { Array(3) {0} }
        for (i in garbage.indices) {
            val word = garbage[i]
            for (c in word) {
                when (c) {
                    'G' -> h[i][0]++
                    'M' -> h[i][1]++
                    else -> h[i][2]++
                }
            }
        }
        println(h.contentDeepToString())
        var last0 = -1
        var last1 = -1
        var last2 = -1
        var count = 3
        
        for (i in h.lastIndex downTo 0) {
            val house = h[i]
            if (last0 < 0 && house[0] > 0) {
                last0 = i
                count--
            }
            if (last1 < 0 && house[1] > 0) {
                last1 = i
                count--
            }
            if (last2 < 0 && house[2] > 0) {
                last2 = i
                count--
            }
            if (count == 0) break
        }
        var total = 0
        for (i in h.indices) {
            if (i <= last0) {
                if (i !=0) total += travel[i-1]
                total += h[i][0]
            }
            if (i <= last1) {
                if (i !=0) total += travel[i-1]
                total += h[i][1]
            }
            if (i <= last2) {
                if (i !=0) total += travel[i-1]
                total += h[i][2]
            }
        }
        

        
        return total
    }
}