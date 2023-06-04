class Solution {
    fun semiOrderedPermutation(nums: IntArray): Int {
        var firstInd = -1
        var lastInd = -1
        if (nums[0] == 1 && nums[nums.lastIndex] == nums.size) return 0
        for(i in nums.indices) {
            if (nums[i] == 1) {
                firstInd = i
            }
            if (nums[i] == nums.size) {
                lastInd = i
            }
        }
        if (firstInd > lastInd) {
            return firstInd -1 + nums.lastIndex - lastInd
        } else {
            return firstInd + nums.lastIndex - lastInd
        }
        
    }

}