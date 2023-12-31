class Solution {
    fun hasTrailingZeros(nums: IntArray): Boolean {
        var count = 0
        for (n in nums) {
            if (n%2 == 0) count++
        }
        return (count >= 2)
    }
}