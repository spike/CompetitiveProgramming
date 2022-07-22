class Solution { 
    fun projectionArea(grid: Array<IntArray>): Int {
        var total = 0; var totalShapes = 0
        var maxY = 0; var maxX = 0
        for (y in grid.indices) {
            var maxX = 0
            for (x in grid[0].indices) {
                maxX = Math.max(grid[y][x], maxX)
                if (grid[y][x] > 0) totalShapes++
            }
            total += maxX
        }
        total += totalShapes
        for (x in grid[0].indices) {
            var maxY = 0
            for (y in grid.indices) {
                maxY = Math.max(grid[y][x], maxY)
            }
            total += maxY
        }
        return total
    }
}