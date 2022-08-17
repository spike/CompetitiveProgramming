class Solution {
    fun findLengthOfLCIS(nums: IntArray): Int {
        var max = 1
        var count = 1
        for (i in 1..nums.lastIndex) {
            if (nums[i] > nums[i-1]) count++
            else count = 1
            max = Math.max(count, max)
        }
        return max
    }
}