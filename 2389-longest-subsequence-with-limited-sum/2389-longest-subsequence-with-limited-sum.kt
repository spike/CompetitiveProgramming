class Solution {
    fun answerQueries(nums: IntArray, queries: IntArray): IntArray {
        nums.sort()
        val arr = IntArray(queries.size)
        for (i in queries.indices) {
            var total = 0
            var count = 0
            for (n in nums) {
                if (n + total <= queries[i]) {
                    total += n
                    count++
                } else {
                    break
                }
            }
            arr[i] = count
        }
        return arr
    }
}