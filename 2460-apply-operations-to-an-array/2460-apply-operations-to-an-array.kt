class Solution {/* 
[1,2,2,1,1,0]
 1,4,0,2,0,0
 A
     B
 1,4,2,0,0,0
[0,1]
0,1
1,0
*/
    fun applyOperations(nums: IntArray): IntArray {
        val q: Queue<Int> = LinkedList<Int>()
        
        for (i in 1..nums.lastIndex) {
            if (nums[i-1] == nums[i]) {
                nums[i-1] *= 2
                nums[i] = 0
            }
            if (nums[i-1] != 0) {
                q.add(nums[i-1])
            }
        }
        if (nums[nums.lastIndex] != 0) {
            q.add(nums[nums.lastIndex])
        }
        for (i in nums.indices) {
            if (!q.isEmpty()) {
                nums[i] = q.remove()
            } else {
                nums[i] = 0
            }
        }
        return nums
    }
}