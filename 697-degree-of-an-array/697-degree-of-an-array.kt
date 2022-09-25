class Solution {
    fun findShortestSubArray(nums: IntArray): Int {
        val hm = HashMap<Int, Num>()
        var max = 0
        for (i in nums.indices) {
            val n = nums[i]
            val num = hm.getOrDefault(n, Num(0, i, i))
            num.freq++
            num.maxIndex = i
            hm[n] = num
            max = Math.max(num.freq, max)
        }
        if (max == 1) return 1  // no duplicate, so return length 1
        var minGap = Integer.MAX_VALUE
        hm.forEach { k, num ->
            if (num.freq == max) {
                val gap = 1 + num.maxIndex - num.minIndex 
                minGap = Math.min(gap, minGap)
            }
        }
        return minGap
    }
    data class Num (var freq: Int, var minIndex: Int, var maxIndex: Int)
}