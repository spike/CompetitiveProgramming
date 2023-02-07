class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val arr = IntArray(nums.size)
        var count = 0
        for (i in 0..n-1) {      
            arr[i+count] = nums[i]
            count++
            arr[i+count] = nums[i+n]
        }
        return arr
    }
}