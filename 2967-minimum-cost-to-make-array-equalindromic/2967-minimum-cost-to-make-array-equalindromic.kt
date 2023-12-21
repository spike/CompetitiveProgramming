class Solution {
    fun minimumCost(nums: IntArray): Long {
        nums.sort()
        val n = nums.size
        val m: Long = if (n % 2 == 1) 0L+nums[n/2] else 0L+(nums[n/2] + nums[n/2])/2
        var inc = m
        var dec = m
        var res1 = 0L
        var res2 = 0L
        while (!isPol(inc)) { inc++ }
        while (!isPol(dec)) { dec-- }
        for (i in nums.indices) {
            res1 += Math.abs(inc - nums[i])
            res2 += Math.abs(dec - nums[i])
        }
        return minOf(res1, res2)
    }
    fun isPol(num: Long): Boolean {
        val lst = ArrayList<Long>()
        var n = num
        while(n > 0) {
            lst.add(n%10)
            n /= 10
        }
        for (i in 0..lst.size/2) {
            if (lst[i] != lst[lst.lastIndex-i]) return false
        }
        return true
    }
}