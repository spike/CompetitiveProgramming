class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0; var right = nums.lastIndex
        var mid = 0
        while (left <= right) {
            mid = left + (right-left)/2
            if (nums[mid] == target) {
                return mid
            } else if (nums[mid] < target) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return -1
    }
}