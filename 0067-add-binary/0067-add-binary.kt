class Solution {
    fun addBinary(a: String, b: String): String {
        var i = a.lastIndex
        var j = b.lastIndex
        var sum = 0
        val sb = StringBuilder()
        while (i >= 0 || j >= 0) {
            if (i >= 0 && a[i] == '1') sum++
            if (j >= 0 && b[j] == '1') sum++
            sb.append(sum%2)
            sum /= 2
            i--; j--;
        }
        if (sum > 0) sb.append(sum%2)
        return sb.reverse().toString()
    }
}