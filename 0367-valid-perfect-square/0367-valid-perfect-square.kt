class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        val n = num.toLong()
        var left = 0L; var right = num.toLong()
        while(left <= right) { 
            val mid = left + (right-left) /2   
            if (mid * mid == n) return true
            else if (mid * mid < n) { 
                left = mid + 1L 
            } else {
                right = mid - 1L
            }
        } 
        return false
    }
}