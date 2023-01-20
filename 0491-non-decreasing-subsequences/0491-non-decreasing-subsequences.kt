class Solution {
    fun findSubsequences(nums: IntArray): List<List<Int>> {
        var subs = mutableSetOf<List<Int>>()
        val n = nums.size
        fun backtrack(index: Int, seq: List<Int>): Unit {
            if (index == n) {
                if (seq.size >= 2) {
                subs.add(seq)
                }
                return Unit
            } else {
                if (seq.isEmpty() || nums[index] >= seq[seq.size - 1]) {
                    backtrack(index + 1, seq + listOf(nums[index]))
                }
                backtrack(index + 1, seq)
                return Unit
            }
        }
        backtrack(0, listOf<Int>())
        return subs.toList()
    }
}