class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var lo = 0
        var hi = nums.lastIndex + 1
        var mid = 0
        while (lo < hi) {
            mid = lo + (hi-lo)/2
            if (nums[mid] < target) {
                lo = mid + 1
            } else {
                hi = mid
            }
        }
        return lo
    }
}