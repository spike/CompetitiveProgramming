class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var max = nums[0]
        for (i in 1..nums.lastIndex) {
            nums[i] = Math.max(nums[i], nums[i] + nums[i-1])
            max = Math.max(nums[i], max)
        }
        return max
    }
}