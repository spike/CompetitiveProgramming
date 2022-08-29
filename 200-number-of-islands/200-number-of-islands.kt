class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        var count = 0
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] == '1') {
                    count++
                    dfs(grid, i, j, count)
                }       
            }
        }
        return count
    }
    fun dfs(grid: Array<CharArray>, i: Int, j: Int, count: Int) {
        grid[i][j] = ('1' + count).toChar()
        if (i-1 >= 0  && grid[i-1][j] == '1') {
            dfs(grid, i-1, j, count)
        }
        if (j-1 >= 0 && grid[i][j-1] == '1') {
            dfs(grid, i, j-1, count)
        }
        if (i+1 <= grid.lastIndex && grid[i+1][j] == '1') {
            dfs(grid, i+1, j, count)
        }
        if (j+1 <= grid[0].lastIndex && grid[i][j+1] == '1') {
            dfs(grid, i, j+1, count)
        }
        return
    }
}