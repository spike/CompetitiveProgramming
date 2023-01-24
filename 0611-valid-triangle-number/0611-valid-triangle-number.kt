class Solution {
    fun triangleNumber(nums: IntArray): Int {
        nums.sort()
        var triangles = 0
        for (i in (0 until nums.size - 2)) {
            for (j in (i + 1 until nums.size - 1)) {
                val a = nums[i]
                val b = nums[j]
                val firstGe = bsearch(nums, j + 1, a + b)
                triangles += firstGe - j - 1
            }
        }
        return triangles
    }

    fun bsearch(nums: IntArray, bIndex: Int, target: Int): Int {
        var p = bIndex
        var q = nums.size
        while (p < q) {
            val m = (p + q) / 2
            if (nums[m] >= target) {
                q = m
            } else {
                p = m + 1
            }
        }
        return p
    }
}