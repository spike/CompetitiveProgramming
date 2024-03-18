class Solution {
    fun singleNumber(nums: IntArray): Int {
        val hs = HashSet<Int>()
        for (n in nums) {
            if (n in hs) {
                hs.remove(n)
            } else {
                hs.add(n)
            }
        }
        for (n in hs) {
            return n
        }
        return -1
    }
}