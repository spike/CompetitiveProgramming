class Solution {
    // Note: this problem is counter-intuitive because
    // the zeros are stacked to the right, not the left!
    // Input:    [ 5, 0, 1, 0, 3]
    // Expected: [ 5, 1, 3, 0, 0] 
    fun moveZeroes(nums: IntArray): Unit {
        var second = 0
        // println(nums.contentToString())
        for (first in nums.indices)
            if (nums[first] != 0) 
                nums[first] = nums[second].also { nums[second++] = nums[first] }
        
        // println(nums.contentToString())
    }
}