class Solution {
    fun findCenter(edges: Array<IntArray>): Int {
        val hm = HashMap<Int, Int>()
        for (e in edges) {
            hm.put(e[0], hm.getOrDefault(e[0], 0) + 1)
            hm.put(e[1], hm.getOrDefault(e[1], 0) + 1)
        }
        var max = 0
        var answer = -1
        for ((key, value) in hm) {
            if (value > max) {
                max = value
                answer = key
            }
        }
        return answer
    }
}