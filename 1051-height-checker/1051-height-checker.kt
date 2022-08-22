class Solution {
    fun heightChecker(heights: IntArray): Int {
        val exp = heights.clone()
        exp.sort()
        var count = 0
        for (i in heights.indices) {
            if (heights[i] != exp[i]) count++
        }
        return count
    }
}