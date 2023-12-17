class Solution {
    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
        val arr = Array(grid.size * grid.size + 1) { false }
        val res = IntArray(2) {0}
        for (y in grid.indices) {
            for (x in grid[0].indices) {
                val n = grid[y][x]
                if (arr[n]) {
                    res[0] = n
                }
                arr[n] = true
            }
        }
        for (i in 1..arr.lastIndex) {
            if (!arr[i]) {
                res[1] = i
                break
            }
        }
        return res
    }
}