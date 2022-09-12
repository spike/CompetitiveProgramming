class Solution {
    lateinit var dp: Array<Int>
    
    fun climbStairs(n: Int): Int {
        dp = Array(n+1) {0}
        return topDown(n)
        //return bottomUp(n)
      // return iterative(n)
    }
    
    fun bottomUp(n: Int): Int {
        dp[0] = 1
        dp[1] = 1
        for (i in 2..n) {
            dp[i] = dp[i-2] + dp[i-1]
        }
        return dp[dp.lastIndex]
    }
    
    fun topDown(n: Int): Int {
        if (n <= 1) return 1
        if (dp[n] > 0) return dp[n]
        var sum = topDown(n-1)
        sum += topDown(n-2)
        dp[n] = sum
        return sum
    }
}