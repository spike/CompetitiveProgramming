class Solution {
    fun climbStairs(n: Int): Int {
        val dp = Array(n+1) {0}
        dp[0] = 1
        dp[1] = 1
        for (i in 2..n) {
            dp[i] = dp[i-2] + dp[i-1]
        }
        return dp[dp.lastIndex]
    }
}