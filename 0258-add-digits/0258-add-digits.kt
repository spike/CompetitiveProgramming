class Solution {
    fun addDigits(num: Int): Int {
        if (num < 10) return num
        return addDigits(sumDigits(num, 0))
    }
    fun sumDigits(num: Int, sum: Int): Int {
        if (num == 0) return sum
        return sumDigits(num / 10, sum + num%10)
    }
}