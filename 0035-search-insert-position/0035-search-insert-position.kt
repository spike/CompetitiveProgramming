class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.lastIndex + 1  
        var minResult = 0
        var mid = 0
        while (low < high) {  
            mid = low + (high - low) / 2
            if (nums[mid] >= target) {
                high = mid
            } else { 
                low = mid + 1
            }            
        }
        return low
    }
}