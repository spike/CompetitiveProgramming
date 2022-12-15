//   _abcde
// a 011111
// c 011222
// e 011223


//    aa 
//. cb
// cc. ec

class Solution {  // Bottom-up DP
    fun longestCommonSubsequence(s1: String, s2: String): Int {
        val dp = Array(s1.length + 1) { IntArray(s2.length + 1) }
        for (i in 1..dp.lastIndex) {
            for (j in 1..dp[0].lastIndex) {
                if (s1[i-1] == s2[j-1]) {
                    dp[i][j] = 1 + dp[i-1][j-1]
                } else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])
                }
            }
        }
        return dp[dp.lastIndex][dp[0].lastIndex]
    }
}



// class Solution {  // Recursive approach with top-down dp memoization
//     fun longestCommonSubsequence(s1: String, s2: String): Int {
//         val dp = Array(s1.length) { Array<Int?>(s2.length) { null } }
//         return helper(s1, s2, 0, 0, dp)
//     }
//     fun helper(s1: String, s2: String, i: Int, j: Int, dp: Array<Array<Int?>>): Int {
//         if (i > s1.lastIndex || j > s2.lastIndex) {
//             return 0
//         }
//         if (dp[i][j] != null) {
//             return dp[i][j]!!
//         } 
//         if (s1[i] == s2[j]) {
//             dp[i][j] = 1 + helper(s1, s2, i+1, j+1, dp)
//             return dp[i][j]!!
//         }  else {
//             dp[i][j] = Math.max(helper(s1, s2, i+1, j, dp),
//                                 helper(s1, s2, i, j+1, dp))
//             return dp[i][j]!!
//         }
//     }
// }