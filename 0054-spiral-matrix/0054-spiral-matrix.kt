class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        if (matrix.isEmpty() || matrix[0].isEmpty()) return emptyList()

        val result = arrayListOf<Int>()

        var rowBegin = 0
        var rowEnd = matrix.size - 1
        var columnBegin = 0
        var columnEnd = matrix[0].size - 1

        while (rowBegin <= rowEnd && columnBegin <= columnEnd) {
            for (i in columnBegin..columnEnd)
                result.add(matrix[rowBegin][i])
            rowBegin++

            for (i in rowBegin..rowEnd) 
                result.add(matrix[i][columnEnd])
            columnEnd--

            if (rowBegin <= rowEnd) {
                for (i in columnEnd downTo columnBegin)
                    result.add(matrix[rowEnd][i])
                rowEnd--
            }
            if (columnBegin <= columnEnd) {
                for (i in rowEnd downTo rowBegin)
                    result.add(matrix[i][columnBegin])
                columnBegin++
            }
        }
        return result
    }
}