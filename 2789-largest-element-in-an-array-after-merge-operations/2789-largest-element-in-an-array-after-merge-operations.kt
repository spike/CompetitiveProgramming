class Solution {
    fun maxArrayValue(nums: IntArray): Long {
        var lastElement = 0L + nums[nums.lastIndex]
        var m = lastElement
        for (i in nums.lastIndex downTo 1) {
            if (nums[i-1] <= lastElement) {
                lastElement += nums[i-1]
            } else {
                lastElement = 0L + nums[i-1]
            }
            m = maxOf(lastElement, m)
        }
        return m
    }
}