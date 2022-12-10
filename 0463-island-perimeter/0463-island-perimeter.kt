class Solution {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        var perimeter = 0
        for (y in grid.indices) {
            for (x in grid[0].indices) {
                if (grid[y][x] == 1) {
                    perimeter += 4
                    if (isNeighbor(y-1, x, grid)) perimeter -= 2
                    if (isNeighbor(y, x-1, grid)) perimeter -= 2
                }
            }
        }
        return perimeter
    }
    fun isNeighbor(y: Int, x: Int, grid: Array<IntArray>): Boolean {
        if (y < 0 || x < 0) return false
        return (grid[y][x] == 1) 
    }
}