class Solution {
    /*
    nums = [9,12,5,10,14,3,10], pivot = 10
            9,5  10,  12, 
    */
    fun pivotArray(nums: IntArray, pivot: Int): IntArray {
        val before: Queue<Int> = LinkedList<Int>()
        val after: Queue<Int> = LinkedList<Int>()
        var pivots = 0
        for (n in nums) {
            if (n == pivot) {
                pivots++
            } else if (n < pivot) {
                before.add(n)
            } else {
                after.add(n)
            }
        }
        var i = 0
        while (!before.isEmpty()) {
            nums[i] = before.remove()
            i++
        }
        while (pivots > 0) {
            nums[i] = pivot
            pivots--
            i++
        }
        while (!after.isEmpty()) {
            nums[i] = after.remove()
            i++
        }
        return nums
    }
}