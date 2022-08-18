class Solution {
    fun minimumAbsDifference(arr: IntArray): List<List<Int>> {
        arr.sort()
        var min = Integer.MAX_VALUE
        for (i in 1..arr.lastIndex) {
            val diff = Math.abs(arr[i] - arr[i-1])
            min = Math.min(diff, min)
        }
        val lst = mutableListOf<List<Int>>()
        for (i in 1..arr.lastIndex) {
            val diff = Math.abs(arr[i] - arr[i-1])
            if (diff == min) {
                lst.add(listOf(arr[i-1], arr[i]))
            }
        }
        return lst.toList()
    }
}