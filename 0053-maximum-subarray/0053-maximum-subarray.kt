class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var max = nums[0]
        for (i in 1..nums.lastIndex) {
            nums[i] = maxOf(nums[i], nums[i] + nums[i-1])
            max = maxOf(nums[i], max)
        }
        return max
    }
}