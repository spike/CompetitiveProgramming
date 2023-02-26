class Solution { /*
[10,4,8,3]
10,14,22,25
25,15,11,3

[15,1,11,22]
*/
    fun leftRigthDifference(nums: IntArray): IntArray {
        val leftSum = IntArray(nums.size) 
        val rightSum = IntArray(nums.size)
        var acc = 0
        for (i in leftSum.indices) {
            acc += nums[i]
            leftSum[i] = acc
        }
        acc = 0
        for (i in rightSum.lastIndex downTo 0) {
            acc += nums[i]
            rightSum[i] = acc
        }
        for (i in nums.indices) {
            nums[i] = Math.abs(leftSum[i] - rightSum[i])
        }
        return nums
    }
}