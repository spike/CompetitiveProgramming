class Solution {
    fun romanToInt(s: String): Int {
        val m = mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50,
                     'C' to 100, 'D' to 500, 'M' to 1_000)
        var total = 0
        var prev = 0
        for (i in s.lastIndex downTo 0) {
            val c: Char = s[i]
            if (prev <= m[c]!!) {
                total += m[c]!!
            } else {
                total -= m[c]!!
           }
           prev = m[c]!!
        }
        return total
    }
}