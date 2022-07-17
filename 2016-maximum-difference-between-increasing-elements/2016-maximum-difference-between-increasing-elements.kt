class Solution {
    fun maximumDifference(nums: IntArray): Int {
        var min = Integer.MAX_VALUE
        var max = Integer.MIN_VALUE
        var delta = -1
        for (n in nums) {
            if (n < min) {
                min = n
                max = n
            } else {
                max = Math.max(n, max)
            }
            if (max-min > 0) {
                delta = Math.max(max-min, delta)
            }
        }
        return delta
    }
}