class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var l = 0; var r = nums.lastIndex
        while (l < r) {
            if (nums[l]%2 == 0) l++
            else if (nums[r]%2 == 1) r--
            else if (nums[l]%2 != 0 && nums[r]%2 != 1) {
                nums[l] = nums[r].also{ nums[r] = nums[l] }
                l++; r--
            }
        }
        return nums
    }
}