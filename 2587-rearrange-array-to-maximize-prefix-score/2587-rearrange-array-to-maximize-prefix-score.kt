class Solution {
    fun maxScore(nums: IntArray): Int {
        nums.sort()
        var total = 0L
        var count = 0
        for (i in nums.lastIndex downTo 0) {
            total += nums[i]
            if (total > 0) count++
        }
        return count
    }
}