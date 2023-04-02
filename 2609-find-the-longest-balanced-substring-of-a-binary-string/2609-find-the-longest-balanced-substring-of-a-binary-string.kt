class Solution {
    fun findTheLongestBalancedSubstring(s: String): Int { 
        var max = 0
        var total = 0
        var zeros = 0
        for (i in s.indices) {  // 
            val c = s[i]
            if (c == '0') {  // true
                total = 0
                if (i > 0 && s[i-1] == '1') {
                    zeros = 0
                }
                zeros++  // 1
            } else {
                if (zeros > 0) {  // true
                    zeros--  // 0
                    total += 2  // 2
                    max = maxOf(total, max) // 2
                } else {
                    total = 0
                }
            }
        }
        
        return max
    }
}