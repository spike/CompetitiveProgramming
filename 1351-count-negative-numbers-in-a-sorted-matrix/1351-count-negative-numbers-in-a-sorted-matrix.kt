class Solution {
    fun countNegatives(grid: Array<IntArray>): Int {
        var count = 0
        for (y in grid.indices) {
            for (x in grid[0].indices) {
                if (grid[y][x] < 0) count++
            }
        }
        return count
    }
}