class Solution {
    fun addStrings(n1: String, n2: String): String {
        val sb = StringBuilder()
        var i = n1.lastIndex
        var j = n2.lastIndex
        var carry = 0
        while (i >= -1 || j >= -1) {
            var res = carry
            carry = 0
            res += if (i < 0) 0 else n1[i]-'0'
            res += if (j < 0) 0 else n2[j]-'0'
            if (res == 0 && i < 0 && j < 0) break
            if (res > 9) {
                carry = res / 10
                res %= 10
            }
            sb.append(res)
            i--
            j--
        }
        return sb.reverse().toString()
    }
}