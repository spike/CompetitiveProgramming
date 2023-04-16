class Solution {
    fun maxDivScore(nums: IntArray, divisors: IntArray): Int {
        val s = IntArray(divisors.size) {0}
        for (i in divisors.indices) {
            var d = divisors[i]
            var count = 0
            for (n in nums) {
                if (n%d == 0) {
                    count++
                }
            }
            s[i] = count
        }
        var max = 0
        var minEle = Integer.MAX_VALUE
        for (i in s.indices) {
            if (s[i] >= max) {
                max = s[i]
                
            }
        }
        for (i in s.indices) {
            if (s[i] == max) {
                minEle = minOf(divisors[i], minEle)
            }
        }
        return minEle
    }
}