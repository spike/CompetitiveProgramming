class Solution {
    fun divideArray(nums: IntArray, k: Int): Array<IntArray> {
        val arr = Array<IntArray>(nums.size/3) { intArrayOf(0,0,0) }
        nums.sort()
        var min = -1
        var max = Integer.MAX_VALUE
        var j = 0
        for (i in 2..nums.lastIndex step 3) {
            min = minOf(nums[i-2], nums[i-1], nums[i])
            max = maxOf(nums[i-2], nums[i-1], nums[i])
            if (max - min > k) { return emptyArray() }
            arr[j][0] = nums[i-2]
            arr[j][1] = nums[i-1]
            arr[j][2] = nums[i]
            j++
        }
        return arr
            
    }
}