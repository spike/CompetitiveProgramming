class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var l = 0; var r = nums.lastIndex
        while (l < r) {
            while (nums[l]%2 == 0 && l < r) l++
            while (nums[r]%2 == 1 && l < r) r--
            if (nums[l]%2 != 0 && nums[r]%2 != 1 && l < r) {
                nums[l] = nums[r].also{ nums[r] = nums[l] }
                l++; r--
            }
        }
        return nums
    }
}