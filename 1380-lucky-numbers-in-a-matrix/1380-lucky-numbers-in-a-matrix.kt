class Solution {
    // min row
    // max col
    fun luckyNumbers (matrix: Array<IntArray>): List<Int> {
        val lst = mutableListOf<Int>()
        val minRow = Array(matrix.size) { Integer.MAX_VALUE }
        val maxCol = Array(matrix[0].size) { Integer.MIN_VALUE}
        for (y in matrix.indices) {
            for (x in matrix[0].indices) {
                minRow[y] = Math.min(matrix[y][x], minRow[y])
            }
        }
        for (x in matrix[0].indices) {
            for (y in matrix.indices) {
                maxCol[x] = Math.max(matrix[y][x], maxCol[x])
            }
        }
        for (min in minRow) { 
            if (min in maxCol) lst.add(min)
        }
        return lst
    }
}