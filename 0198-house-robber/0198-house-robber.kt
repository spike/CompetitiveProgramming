class Solution {
    fun rob(nums: IntArray): Int {
        var totalMaximum = 0
        for (i in 2..nums.lastIndex) {
            if (i == 2) {
                nums[i] += nums[i-2]
            } else {
                nums[i] = Math.max(nums[i-2]+ nums[i], 
                                   nums[i-3]+ nums[i]) 
            }    
        }
        for (i in nums.indices) {
            totalMaximum = Math.max(nums[i], totalMaximum)
        }
        return totalMaximum
    }
}