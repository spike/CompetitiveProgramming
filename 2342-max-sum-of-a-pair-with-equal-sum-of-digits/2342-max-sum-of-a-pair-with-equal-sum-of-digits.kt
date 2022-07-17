class Solution {
    fun maximumSum(nums: IntArray): Int {
        nums.sortDescending()
        val hm = HashMap<Int,Int>()
        var max: Int = -1
        for (n in nums) {
            val d = count(n)
            if (hm.containsKey(d)) {
                max = Math.max((hm.get(d)!! + n), max)
            } else {
                hm.put(d, n)
            }
        }
        return max
    }
    fun count(m: Int): Int {
        var t = 0
        var n = m
        while (n > 0) {
            t += n % 10
            n = n / 10
        }
        return t
    }
}