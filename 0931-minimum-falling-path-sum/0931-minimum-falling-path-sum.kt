class Solution {
    fun minFallingPathSum(matrix: Array<IntArray>): Int {
        val dp = matrix
        var totalMin = Integer.MAX_VALUE
        if (dp.lastIndex == 0) {
            for (x in dp[0].indices) {
                totalMin = Math.min(dp[0][x], totalMin)
            }
        }
        
        for (y in 1..dp.lastIndex) {
            for (x in dp[0].indices) {
                var min = dp[y-1][x]
                if (x != 0) {
                    min = Math.min(dp[y-1][x-1], min)
                }
                if (x != dp[0].lastIndex) {
                    min = Math.min(dp[y-1][x+1], min)
                }
                dp[y][x] += min
                if (y == dp.lastIndex) {
                    totalMin = Math.min(dp[y][x], totalMin)
                }
            }
        }
        return totalMin
    }
}