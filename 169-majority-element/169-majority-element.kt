class Solution {
    fun majorityElement(nums: IntArray): Int {
        val hm = HashMap<Int, Int>()
        var max = 0
        var maxElement = 0
        for (n in nums) {
            val freq = hm.getOrDefault(n, 0) + 1
            hm[n] = freq
            if (freq > max) {
                max = freq
                maxElement = n
            }
        }
        return maxElement
    }
}