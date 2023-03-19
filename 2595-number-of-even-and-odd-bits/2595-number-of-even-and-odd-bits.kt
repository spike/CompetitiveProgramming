class Solution {
    fun evenOddBit(num: Int): IntArray {
        var n = num
        val res = IntArray(2) {0}
        var even = true
        val str = Integer.toBinaryString(n)
        println(str)
        for (i in str.lastIndex downTo 0) {
            if (str[i] == '1') {
                if (even) res[0]++
                else res[1]++
            }
            even = !even
        }

        return res
    }
}