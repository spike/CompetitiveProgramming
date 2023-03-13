class Solution {
    fun solve(board: Array<CharArray>): Unit {
        for(y in board.indices) {
            for (x in board[0].indices) {
                if (y == 0 || y == board.lastIndex ||
                    x == 0 || x == board[0].lastIndex) {
                    if (board[y][x] == 'O') {
                        dfs(y, x, board)
                    }
                }
            }
        }
        for(y in board.indices) {
            for (x in board[0].indices) {
                if (board[y][x] == 'O') {
                    board[y][x] = 'X'
                } 
                if (board[y][x] == 'T') {
                    board[y][x] = 'O'
                }
            }
        }
        return
    }
    fun dfs(y: Int, x: Int, board: Array<CharArray>) {
        if (board[y][x] == 'O') {
            board[y][x] = 'T'
            if (y-1 >= 0) dfs(y-1, x, board)
            if (y+1 <= board.lastIndex) dfs(y+1, x, board)
            if (x-1 >= 0) dfs(y, x-1, board)
            if (x+1 <= board[0].lastIndex) dfs(y, x+1, board)
        }
        return
    }
}