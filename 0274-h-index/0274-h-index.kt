class Solution {
    fun hIndex(citations: IntArray): Int {
        citations.sortDescending()
        var res = 0
        for (i in citations.indices) {
            if (i + 1 <= citations[i]) {
                res = i + 1
            } else {
                return res
            }
        }
        return res
    }
}