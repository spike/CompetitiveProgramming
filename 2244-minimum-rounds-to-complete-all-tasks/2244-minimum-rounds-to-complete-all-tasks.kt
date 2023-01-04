class Solution {
    fun minimumRounds(tasks: IntArray): Int {
        // do a frequency map of each task
        val hm = HashMap<Int, Int>()
        for (t in tasks) {
            hm[t] = hm.getOrDefault(t, 0) + 1
        }
        var sum = 0
        hm.forEach { (k, v) ->
            if (v == 1) return -1
            sum += minCompletion(v)
        }
        return sum
    }
    fun minCompletion(v: Int): Int {
        if (v == 2 && v == 3) return 1
        if (v == 4 && v == 5) return 2
        if (v % 3 == 0) {
            return v / 3
        } else {
            return (v / 3) + 1
        }
    } 
}