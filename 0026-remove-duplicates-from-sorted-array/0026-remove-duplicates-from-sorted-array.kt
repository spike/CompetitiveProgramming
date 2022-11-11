class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var previous = Int.MAX_VALUE
        var newEnd = 0
        for (i in nums.indices){
            if (nums[i] == previous) {
                nums[i] = 0
            } else {
                nums[newEnd] = nums[i]
                newEnd += 1
                previous = nums[i]
            }
        }    
        return newEnd 
    }
}