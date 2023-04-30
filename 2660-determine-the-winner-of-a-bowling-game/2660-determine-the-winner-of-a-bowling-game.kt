class Solution {
    fun isWinner(player1: IntArray, player2: IntArray): Int {
        var tot1 = 0; var tot2 = 0
        var strike1 = false; var strike2 = false
        for (i in player1.indices) {
            tot1 += if (strike1) 2 * player1[i] else player1[i]
            tot2 += if (strike2) 2 * player2[i] else player2[i]
            strike1 = player1[i] == 10 || (i != 0 && player1[i-1] == 10)
            strike2 = player2[i] == 10 || (i != 0 && player2[i-1] == 10)
        }
        if (tot1 == tot2) return 0
        return if (tot1 > tot2) 1 else 2
    }
}