class Solution {
    fun tictactoe(moves: Array<IntArray>): String {
        val board = Array(3) { Array(3) {-1}}
        for (i in 0..moves.lastIndex) {
            val y = moves[i][0]
            val x = moves[i][1]
            if (i%2 == 0) board[y][x] = 1
            else board[y][x] = 0
        }
        if (lastPersonWon(board, moves)) {
            return if (moves.size%2 == 1) "A" else "B"
        } else {
            if (!isComplete(board, moves)) return "Pending"
            else return "Draw"
        }   
    }
    fun isComplete(board: Array<Array<Int>>, 
                   moves: Array<IntArray>): Boolean {
        if (moves.size == 9) return true
        else return false
    }
    fun lastPersonWon(board: Array<Array<Int>>, 
                     moves: Array<IntArray>): Boolean {
        val lastY = moves[moves.lastIndex][0]
        val lastX = moves[moves.lastIndex][1]
        if (board[0][lastX] == board[1][lastX] &&
            board[0][lastX] == board[2][lastX]) return true
        if (board[lastY][0] == board[lastY][1] &&
            board[lastY][0] == board[lastY][2]) return true
        if (board[0][0] == board[1][1] &&
            board[1][1] == board[2][2] &&
            board[1][1] != -1) return true
        if (board[2][0] == board[1][1] &&
            board[0][2] == board[1][1] &&
            board[1][1] != -1) return true
        else return false
    }
}