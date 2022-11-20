class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val hm = HashMap<Int, Int>()
        for (i in nums.indices) {
            if (hm.containsKey(nums[i])) {
                if (hm[nums[i]!!]!! >= (i-k)) return true
            }
            hm[nums[i]] = i
        }
        return false
    }
}