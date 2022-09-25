class Solution {
    // [1,2,3,3,2,2]
    //  i
    //    j
    // 1= 0001
    // 2= 0010
    // 3= 0011
    
    
    // [1,2,3,4]
    //
    //  
    // 1= 0001
    // 2= 0010
    // 3= 0011
    // 4= 0100
    // 
    fun longestSubarray(nums: IntArray): Int {
        var max = Integer.MIN_VALUE
        for (n in nums) {
            max = Math.max(n, max)
        }
        var maxLen = 1
        var count = 0
        for (i in nums.indices) {
            if (nums[i] == max) {
                count++
                maxLen = Math.max(maxLen, count)
            } else {
                count = 0
            }
            
        }
        return maxLen
    }
}