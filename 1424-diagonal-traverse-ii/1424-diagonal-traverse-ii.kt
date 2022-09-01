class Solution {
    fun findDiagonalOrder(nums: List<List<Int>>): IntArray {
        val hm = LinkedHashMap<Int, ArrayList<Int>>()
        var count = 0
        for (i in nums.indices) {
            for (j in nums.get(i).indices) {
                hm.getOrPut(i + j, { ArrayList() }).add(nums[i][j])
                count++
            }
        }
        val arr = IntArray(count)
        var i = 0
        hm.forEach { key, value ->
            for (j in value.lastIndex downTo 0) {
                arr[i] = value[j]
                i++
            }
        }
        return arr   
    }
}