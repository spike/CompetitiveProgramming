class Solution {
    fun singleNumber(nums: IntArray): Int {
        val hs = HashSet<Int>()
        for (n in nums) {
            if (!hs.add(n)) {
                hs.remove(n)
            }
        }
        for (n in hs) {
            return n
        }
        return -1
    }
}