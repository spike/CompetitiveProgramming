class Solution {
    fun countBits(num: Int): IntArray {
        var n = num
        val arr = IntArray(num+1)
        for (i in 1..num) {
            var count = 0
            var n = i
            while (n != 0) {
                n = n and (n - 1)
                count++
            }
            arr[i] = count
        }
        return arr
    }
}