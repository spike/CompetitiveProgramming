class Solution {
    fun countBits(num: Int): IntArray {
        var n = num
        val arr = IntArray(num+1)
        for (i in 1..num) {
            var count = 0
            var n = i
            while (n > 0) {
                count += n % 2
                n /= 2
            }
            arr[i] = count
        }
        return arr
    }
}