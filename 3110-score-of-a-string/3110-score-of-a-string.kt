class Solution {
    fun scoreOfString(s: String): Int {
        var res = 0
        for (i in 1..s.lastIndex) {
            res += abs(s[i-1]-s[i])
        }
        return res
    }
}