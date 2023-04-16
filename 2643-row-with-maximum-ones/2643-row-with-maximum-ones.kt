class Solution { 
    fun rowAndMaximumOnes(mat: Array<IntArray>): IntArray {
        var maxRow = 0
        var max = 0
        for (rowIndex in mat.indices) {
            var count = 0
            for (j in mat[0].indices) {
                if (mat[rowIndex][j] == 1) count++
            }
            if (count > max) {
                max = count 
                maxRow = rowIndex
            }
        }
        return intArrayOf(maxRow, max)
    }
}