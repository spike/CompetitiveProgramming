class Solution {
    fun mergeAlternately(w1: String, w2: String): String {
        val sb = StringBuilder()
        for (i in w1.indices) {
            sb.append(w1[i])   
            if (i <= w2.lastIndex) sb.append(w2[i])
        }
        var i = w1.lastIndex + 1
        while (i <= w2.lastIndex) {
            sb.append(w2[i])
            i++
        }
        return sb.toString()
    }
}