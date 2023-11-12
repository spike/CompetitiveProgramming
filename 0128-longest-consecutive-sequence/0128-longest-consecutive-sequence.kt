class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val hs = HashSet<Int>()
        var longest = 0
        for (n in nums) { hs.add(n) }
        for (n in nums) {
            var left = n - 1
            var count = 1
            if (!hs.contains(left)) {
                var right = n + 1
                while (right in hs) {
                    count += 1
                    right += 1
                }
            }
            longest = maxOf(count, longest)
        }
        return longest
    }
}