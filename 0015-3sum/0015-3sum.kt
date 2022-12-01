class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val hs = HashSet<Int>()
        val noDups = HashSet<String>()
        val results = mutableListOf<List<Int>>()
        for (i in nums.indices) {
            for (j in i+1..nums.lastIndex) {
                val target = 0 - nums[i] - nums[j]
                if (hs.contains(target)) {
                    val s = arrayOf(target,nums[i],nums[j]).sorted()
                    if (noDups.add("${s[0]}=${s[1]}=${s[2]}")) {
                        results.add(listOf(target,nums[i],nums[j]))
                    }
                }
            }
            hs.add(nums[i])
        }
        return results
    }
}