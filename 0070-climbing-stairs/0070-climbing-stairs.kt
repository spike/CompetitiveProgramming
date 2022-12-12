class Solution {
    lateinit var dp: Array<Int>
    fun climbStairs(n: Int): Int {
        if (n == 1) return 1
        dp = Array(n+1) {0}
        dp[1] = 1
        dp[2] = 2
        for (i in 3..dp.lastIndex) {
            dp[i] = dp[i-1] + dp[i-2]
        }
        return dp[n]
    }
}