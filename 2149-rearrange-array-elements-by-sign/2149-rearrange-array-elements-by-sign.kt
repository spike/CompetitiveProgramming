class Solution {
    fun rearrangeArray(nums: IntArray): IntArray {
        val positives: Queue<Int> = LinkedList()
        val negatives: Queue<Int> = LinkedList()
        for (i in nums.indices) {
            if (nums[i] > 0) 
                positives.add(nums[i])
            else 
                negatives.add(nums[i])
        }
        val arr = IntArray(nums.size)
        var i = 0
        while (!positives.isEmpty() || !negatives.isEmpty()) {
            if (i%2 == 0) 
                arr[i] = positives.remove(); 
            else 
                arr[i] = negatives.remove();
            i++
        }
        return arr
    }
}