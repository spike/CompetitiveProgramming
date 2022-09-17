class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var max = 0
        var curr =0
        for (n in gain) {
            curr += n
            max = Math.max(curr, max)
        }
        return max
    }
}