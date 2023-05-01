class Solution {
    fun average(salary: IntArray): Double {
        var min = Integer.MAX_VALUE; var max = 0
        var count = -2; var total = 0.0
        for (i in salary.indices) {
            min = minOf(min, salary[i])
            max = maxOf(max, salary[i])
            total += salary[i]
            count++
        }
        total = total - min - max
        return total / count
    }
}