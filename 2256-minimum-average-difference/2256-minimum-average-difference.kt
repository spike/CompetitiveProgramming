class Solution {
    fun minimumAverageDifference(nums: IntArray): Int {
        val prefix = LongArray(nums.size) {0L}
        val suffix = LongArray(nums.size+1) {0L}
        val arr = LongArray(nums.size) {0L}
        for (i in nums.indices) {
            prefix[i] = nums[i].toLong()
            suffix[i] = nums[i].toLong()
        }
        var min = Long.MAX_VALUE
        var minIndex = 0
        
        for (i in 1..nums.lastIndex) {
            prefix[i] += prefix[i-1] 
        }
        for (i in nums.lastIndex downTo 0) {
            suffix[i] += suffix[i+1]
        }
        for (i in 0..prefix.lastIndex) {
            val divisor =  nums.size-i-1
            var m: Long = 0L
            if (i == prefix.lastIndex) {
                m = Math.abs(prefix[i]/(i+1L))
            } else {
                m = Math.abs(prefix[i]/(i+1L) -
                             suffix[i+1]/(nums.size-i-1L))
            } 
            if (m < min) {
                min = m
                minIndex = i
            }
        }
        return minIndex
    }
}