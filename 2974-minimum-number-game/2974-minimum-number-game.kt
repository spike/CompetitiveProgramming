class Solution {
    fun numberGame(nums: IntArray): IntArray {
        nums.sort()
        for (i in 1..nums.lastIndex step 2) {
            nums[i] = nums[i-1].also{ nums[i-1] = nums[i] }
        }
        return nums
    }
}