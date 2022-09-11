class Solution {
    fun maximumPopulation(logs: Array<IntArray>): Int {
        val hm = TreeMap<Int, Int>()
        var maxFreq = Integer.MIN_VALUE
        for (arr in logs) {
            for (y in arr[0] until arr[1]) {
                val freq = hm.getOrDefault(y, 0) + 1
                hm.put(y, freq)
                maxFreq = Math.max(freq, maxFreq)
            }
        }
        for ((k, v) in hm) {
            if (v == maxFreq) return k
        }
        return -1
    }
}