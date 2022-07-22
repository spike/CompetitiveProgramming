class Solution {
    fun arraySign(nums: IntArray): Int {
        var count = 0
        for (n in nums) {
            if (n == 0) return 0
            if (n < 0) count++
        }
        return if (count % 2 == 0) 1 else -1
    }
}