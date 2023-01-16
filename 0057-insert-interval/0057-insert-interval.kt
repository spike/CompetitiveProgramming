class Solution {
fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        var new = newInterval
        val list = mutableListOf<IntArray>()
        intervals.forEach {
            when {
                it[1] < new[0] -> list.add(it)
                new[1] < it[0] -> {
                    list.add(new)
                    new = it
                }
                else -> {
                    new[0] = minOf(new[0], it[0])
                    new[1] = maxOf(new[1], it[1])
                }
            }
        }
        list.add(new)

        return list.toTypedArray()
    }
}