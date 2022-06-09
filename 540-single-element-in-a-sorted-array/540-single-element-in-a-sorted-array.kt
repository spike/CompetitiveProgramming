class Solution {
    fun singleNonDuplicate(nums: IntArray): Int {
        var l = 0;
        var r = nums.lastIndex
        var m = 0
        while (l < r) {
            m = l + (r-l)/2
            if (m%2 == 1) m--
            
            if (nums[m] != nums[m+1]) {
                r = m
            } else {
                l = m + 2
            }
        }
        return nums[l]
    }
}