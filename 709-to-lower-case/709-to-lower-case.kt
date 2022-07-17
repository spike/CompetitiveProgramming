class Solution {
    fun toLowerCase(s: String): String {
        val sb = StringBuilder()
        for (c in s) {
            if (c.toInt() in 65..90) sb.append(c+32)
            else sb.append(c)
        }
        return sb.toString()
    }
}