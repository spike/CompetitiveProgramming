class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val set = HashSet<String>()
        for (i in board.indices) {
            for (j in board[0].indices) {
                val n = board[i][j]
                if (n != '.') {
                    if ((!set.add(n + "row" + i)) ||
                        (!set.add(n + "col" + j)) ||
                        (!set.add(n + "sqr" + i/3 + "-" + j/3)))
                    return false
                }
            }
        }
        return true
    }
}