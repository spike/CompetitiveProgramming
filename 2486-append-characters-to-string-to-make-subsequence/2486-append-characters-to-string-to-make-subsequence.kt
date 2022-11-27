class Solution {
    fun appendCharacters(s: String, t: String): Int {
        var n = t.length
        var i = 0; var j = 0
        while (i <= s.lastIndex && j <= t.lastIndex) {
            if (s[i] == t[j]) {
                n--
                i++
                j++
            } else {
                i++
            }
        }
        return n
    }
}