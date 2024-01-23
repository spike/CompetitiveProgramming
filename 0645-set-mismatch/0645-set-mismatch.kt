class Solution {
    fun findErrorNums(nums: IntArray): IntArray {
        val res = IntArray(2) {-1}
        val hs = HashSet<Int>()
        for (i in 1..nums.lastIndex+1) {
            hs.add(i)
        }
        for (i in nums.indices) {
            val value = nums[i]
            if (!hs.remove(value)) {
                res[0] = value
            }
        }
        hs.forEach {
            res[1] = it
        }
        return res
    }
}