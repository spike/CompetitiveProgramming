class Solution {
    fun addStrings(n1: String, n2: String): String {
        val sb = StringBuilder()
        var i = 0
        var remainder = 0
        while (i <= n1.length || i <= n2.length) {
            var res = remainder
            if (i < n1.length) {
                res += n1[n1.lastIndex-i]-'0'
            }
            if (i < n2.length) {
                res += n2[n2.lastIndex-i]-'0'
            }
            if (res == 0) {
                if (i > n1.lastIndex && i > n2.lastIndex) {
                    break
                }
            }
            remainder = 0
            if (res > 9) {
                remainder = res / 10
                res = res % 10
            }
            sb.append(res)
            i++
        }
        return sb.reverse().toString()
    }
}