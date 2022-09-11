class Solution {
    fun mostFrequentEven(nums: IntArray): Int {
        val hs = HashMap<Int, Int>()
        var max = Integer.MIN_VALUE
        var maxFreq = Integer.MIN_VALUE
        for (n in nums) {
            if (n % 2 == 0) {
                val freq = hs.getOrDefault(n, 0) + 1
                if (maxFreq < freq) {
                    maxFreq = freq
                    max = n
                } else if (maxFreq == freq) {
                    max = Math.min(n, max)
                }
                hs.put(n, freq)
            }
        }
        if (hs.size == 0) return -1
        else return max
    }
}