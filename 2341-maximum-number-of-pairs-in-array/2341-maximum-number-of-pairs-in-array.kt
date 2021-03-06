class Solution {
    fun numberOfPairs(nums: IntArray): IntArray {
        val arr = Array(101) {0}
        for (n in nums) {
            arr[n]++
        }
        var leftOvers = 0
        for (f in arr) {
            if (f % 2 == 1) leftOvers++
        }
        return intArrayOf((nums.size-leftOvers)/2, leftOvers)
    }
}
/*
class Solution {
    fun numberOfPairs(nums: IntArray): IntArray {
        val hm = HashMap<Int,Int>()
        for (n in nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1)
        }
        var leftOvers = 0
        for ((_, value) in hm) {
            if (value % 2 == 1) leftOvers++
        }
        return intArrayOf((nums.size-leftOvers)/2, leftOvers)
    }
}
*/
