class Solution {
    fun maximumDifference(nums: IntArray): Int {
        var min = Integer.MAX_VALUE
        var delta = 0
        for (n in nums) {
            min = Math.min(n, min)
            delta = Math.max(n-min, delta)
        }
        delta = if (delta == 0) -1 else delta
        return delta
    }
}