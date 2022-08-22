class Solution {
    fun frequencySort(nums: IntArray): IntArray {
        val hs = HashMap<Int, Int>()
        for (n in nums) {
            hs[n] = (hs[n] ?: 0) + 1
        }
        val arr: IntArray = nums.sortedWith(Comparator<Int>() { a, b ->
            if (hs[a] == hs[b]) {
                b.compareTo(a)
            } else {
                hs[a]!!.compareTo(hs[b]!!)
            }
        }).toIntArray()
        return arr
    }
}