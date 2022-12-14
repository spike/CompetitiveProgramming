class Solution { 
    fun distinctAverages(nums: IntArray): Int {
        val hs = HashSet<Double>()
        nums.sort()
        var left = 0; var right = nums.lastIndex
        while(left < right) {
            hs.add((nums[left] + nums[right]) / 2.0)
            left++
            right--
        }
        return hs.size
    }
}