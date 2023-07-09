class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var total = 0.0
        for (i in 0 until k) {
            total += nums[i]
        }
        var result: Double = total / k.toDouble()
        for (i in k..nums.lastIndex) {
            total += nums[i] - nums[i-k]
            result = maxOf(result, total/k)
        }
        return result   
    }
}