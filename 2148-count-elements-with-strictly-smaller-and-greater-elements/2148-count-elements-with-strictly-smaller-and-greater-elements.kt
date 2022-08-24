class Solution {
    fun countElements(nums: IntArray): Int {
        var min = nums[0]; var max = nums[0]
        for (n in nums) {
            min = Math.min(n, min)
            max = Math.max(n, max)
        }
        var count = 0
        for (n in nums) {
            if (n != min && n != max) count++
        }
        return count
    }
}