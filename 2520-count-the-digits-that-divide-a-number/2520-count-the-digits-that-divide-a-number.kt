class Solution {
    fun countDigits(num: Int): Int {
        var count = 0
        var n = num // 121
        while (n > 0) {
            val m = n % 10
            if (num % m == 0) count++
            n /= 10
        }
        return count
    }
}