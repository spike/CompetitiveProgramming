class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0; 
        var right = height.lastIndex
        var max = 0
        while (left < right) {
            val diff = right - left
            val res = Math.min(height[left], height[right]) * diff
            max = Math.max(res, max)
            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }
        return max
    }
}