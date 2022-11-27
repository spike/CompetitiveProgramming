class Solution {
    fun pivotInteger(n: Int): Int {
        val prefix = Array(n) { it + 1 }
        val suffix = Array(n) { it + 1 }
        for (i in 1..prefix.lastIndex) {
            prefix[i] += prefix[i-1]
        }
        for (i in suffix.lastIndex-1 downTo 0) {
            suffix[i] += suffix[i+1]
        }
        for (i in prefix.indices) {
            if (prefix[i] == suffix[i]) return i+1
        }
        return -1
    }
}