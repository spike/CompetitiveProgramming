class Solution {
    fun findMatrix(nums: IntArray): List<List<Int>> {
        val countMap = IntArray(201) {0}
        var max = 0
        for (n in nums) {
            countMap[n]++
            max = maxOf(countMap[n], max)
        }
        val res = List<ArrayList<Int>>(max) { ArrayList<Int>() }
        for (i in 0..max-1) {
            for (j in countMap.indices) {
                val f = countMap[j]
                if (f > 0) {
                    res[i].add(j)
                    countMap[j]--
                }
            }
        }
        return res
    }
}