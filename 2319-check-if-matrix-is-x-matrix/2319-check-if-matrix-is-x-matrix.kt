class Solution {
    fun checkXMatrix(grid: Array<IntArray>): Boolean {
        for (y in grid.indices) {
            for (x in grid.indices) {
                if (!checkCell(grid, y, x)) return false
            }
        }
        return true
    }
    fun checkCell(grid: Array<IntArray>, y: Int, x: Int): Boolean {
        if (x == y) {
            if (grid[y][x] > 0) return true
            else return false
        } 
        if (x == grid.lastIndex-y) {
            if (grid[y][x] > 0) return true
            else return false
        }
        if (grid[y][x] == 0) return true
        else return false
    }
}