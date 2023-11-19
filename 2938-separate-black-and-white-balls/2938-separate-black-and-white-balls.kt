class Solution {    
    fun minimumSteps(s: String): Long {
        var zeros = 0L
        var res = 0L
        for (i in s.lastIndex downTo 0) {
            if (s[i] == '0') {
                zeros += 1L
            } else {
                res += zeros 
            }
        }
        return res
    }
}