class Solution {
    fun reverseBits(num:Int):Int {
        var n = num
        var m = 0
        for (i in 1..32) {
            m = m shl 1
            m += n % 2
            n = n ushr 1
        }
        return m
    }
}