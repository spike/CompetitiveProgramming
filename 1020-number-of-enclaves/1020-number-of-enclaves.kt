class Solution {
    fun numEnclaves(grid: Array<IntArray>): Int {
        var count = 0
        for (y in grid.indices) {
            for (x in grid[0].indices) {
                if ((x == 0) || x == grid[0].lastIndex ||
                    y == 0 || y == grid.lastIndex) {
                    if (grid[y][x] == 1) {
                        dfs(grid, y, x)
                    }
                }
            }
        }
        for (y in grid.indices) {
            for (x in grid[0].indices) {
                if (grid[y][x] == 1) count++
            }
        }
        return count
    }
    fun dfs(grid: Array<IntArray>, y: Int, x: Int) {
        if (y < 0 || y > grid.lastIndex ||
           x < 0 || x > grid[0].lastIndex ||
           grid[y][x] == 0) {
            return
        }
        grid[y][x] = 0
        dfs(grid, y-1, x)
        dfs(grid, y+1, x)
        dfs(grid, y, x-1)
        dfs(grid, y, x+1)
        return
    }
}