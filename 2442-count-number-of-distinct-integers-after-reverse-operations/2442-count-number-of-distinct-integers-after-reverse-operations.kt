class Solution {
    fun countDistinctIntegers(nums: IntArray): Int {
        val hs = HashSet<Int>()
        var count = 0
        for (n in nums) {
            if (hs.add(n)) count++
            if (hs.add(reverseInt(n))) count++
        }
        return count
    }
    // reverse digits
    fun reverseInt(num: Int): Int {
        var n = num
        var res = 0
        while (n > 0) {
            res = res * 10 + n % 10
            n /= 10
        }
        return res
    }
}