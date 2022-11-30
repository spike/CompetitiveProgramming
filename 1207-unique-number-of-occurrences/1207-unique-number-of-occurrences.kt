class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val hm = HashMap<Int, Int>()
        val hs = HashSet<Int>()
        for (n in arr) {
            hm[n] = hm.getOrDefault(n, 0) + 1
        }
        hm.forEach { (k, v) ->
            if (!hs.add(v)) return false
        }
        return true
    }
}