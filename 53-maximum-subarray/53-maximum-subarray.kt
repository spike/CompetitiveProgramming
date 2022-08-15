class Solution {  
    fun maxSubArray(nums: IntArray): Int { 
        var max = nums[0]!!
        var sum = 0
        var positive = false
        for (n in nums) {  
            if (n >= 0) {
                sum += n
                max = Math.max(sum, max)
                positive = true
            } else {
                if ((sum + n) >= 0) {
                    sum += n
                } else {
                    if (positive) {
                        sum = 0
                        max = Math.max(0, max)
                    }
                }
            }
            max = Math.max(n, max)
        }
        return max
    }
}