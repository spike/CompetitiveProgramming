class Solution {
    fun minimumRecolors(blocks: String, k: Int): Int {
        var w = 0
        for (i in 0 until k) {
            if (blocks[i] == 'W') 
                w++
        }
        var m = w
        for (i in k..blocks.lastIndex) {
            if (blocks[i] == 'W') {
                w++
            }
            if (blocks[i-k] == 'W') {
                w--
            }
            m = minOf(w, m)
        }
        return m
    }
}