class Solution {
    var count = 0
    fun maxMoves(grid: Array<IntArray>): Int {
        count = 0
        val visited = Array<Array<Boolean>>(grid.size) { Array<Boolean>(grid[0].size) {false}}
        for (y in visited.indices) {
            visited[y][0] = true
        }
        for (x in grid[0].indices) {
            for (y in grid.indices) {
                if (visited[y][x]) {
                    check(grid[y][x], y-1, x+1, grid, visited)
                    check(grid[y][x], y, x+1, grid, visited)
                    check(grid[y][x], y+1, x+1, grid, visited)
                }
            }
        }
        return count
    }
    fun check(currentValue: Int, y: Int, x: Int, 
              grid: Array<IntArray>, visited: Array<Array<Boolean>>) {
        if (y < 0 || y > grid.lastIndex || x > grid[0].lastIndex) return
        if (visited[y][x]) return
        if (currentValue < grid[y][x]) {
            visited[y][x] = true
            count = x
        }
        return
    }
}
