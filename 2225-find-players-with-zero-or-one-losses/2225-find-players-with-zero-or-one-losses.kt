class Solution { /*
[[1,3],
[2,3],
[3,6],
[5,6],
[5,7],
[4,5],
[4,8],
[4,9],
[10,4],[10,9]]

*/
    fun findWinners(matches: Array<IntArray>): List<List<Int>> {
        val player = HashMap<Int, Int>()
        for (match in matches) {
            val winner = match[0]
            val loser = match[1]
            player[winner] = player.getOrDefault(winner, 0)
            player[loser] = player.getOrDefault(loser, 0) + 1
        }
        val a = mutableListOf<Int>()
        val b = mutableListOf<Int>()
        for (i in 0..100_000) {
            if (player.containsKey(i)) {
                if (player[i] == 0) a.add(i)
                if (player[i] == 1) b.add(i)
            }
        }
        return listOf(a, b)
    }
}