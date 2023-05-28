class Solution {
    fun removeTrailingZeros(num: String): String {
        var index = -1
        for (i in num.lastIndex downTo 0) {
            if (num[i] == '0') {
                index = i
            } else {
                break
            }
        }
        if (index < 0) return num
        val sb = StringBuilder()
        for (i in num.indices) {
            if (i != index) {
                sb.append(num[i])
            } else {
                break
            }
        }
        return sb.toString()
    }
}