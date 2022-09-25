class Solution {
    fun maxAscendingSum(nums: IntArray): Int {
        val dp = Array(nums.size) {0}
        var max = 0
        dp[0] = nums[0]
        max = dp[0]
        for (i in 1..nums.lastIndex) {
            if (nums[i-1] < nums[i]) {
                dp[i] = dp[i-1] + nums[i]
            } else {
                dp[i] = nums[i]
            }
            max = Math.max(dp[i], max)
        }
        return max
    }
}