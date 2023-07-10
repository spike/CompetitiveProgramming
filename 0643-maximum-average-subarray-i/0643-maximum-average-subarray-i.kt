class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var total = 0.0
        for (i in 0 until k) {
            total += nums[i]
        }
        var result: Double = total / k
        for (i in k..nums.lastIndex) {
            total += nums[i] - nums[i-k]
            result = maxOf(total / k, result)
        }
        return result
    }
}