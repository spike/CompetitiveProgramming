class Solution {
    fun majorityElement(nums: IntArray): List<Int> {
        val hm = HashMap<Int,Int>()
        for (n in nums) {
            val freq = hm.getOrDefault(n, 0) + 1
            hm[n] = freq
        }
        val lst = mutableListOf<Int>()
        hm.forEach { k, v ->
            if (v > (nums.size/3)) {
                lst.add(k)
            }
        }
        return lst
    }
}