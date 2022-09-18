class Solution {
    // can "cba" considered a valid continuous substring?
    fun longestContinuousSubstring(s: String): Int {
        var max = 1
        var count = 1
        for (i in 1..s.lastIndex) {
            if (s[i]-'a' == s[i-1]-'a' + 1) {
                count++
            } else {
                count = 1
            }
            max = Math.max(count, max)
        }
        return max
    }
}