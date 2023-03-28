class Solution { /*
        [1, 4, 6, 7,  8, 20]
      2  2, 4, 6, 8, 10, 12
      7  7
      15 15
*/
    fun mincostTickets(days: IntArray, costs: IntArray): Int {
        val dp7 = ArrayDeque<Pair<Int,Int>>() // day, costsofar
        val dp30 = ArrayDeque<Pair<Int,Int>>()
        var cost = 0
        for (d in days) {
            while (!dp7.isEmpty() && dp7.first().first <= d-7) {
                dp7.removeFirst()
            }
            while (!dp30.isEmpty() && dp30.first().first <= d-30){
                dp30.removeFirst()
            }
            dp7.addLast(Pair(d, cost+costs[1]))
            dp30.addLast(Pair(d, cost+costs[2]))
            cost = minOf(cost+costs[0],dp7.first().second)
            cost = minOf(cost, dp30.first().second)
        }
        return cost
    }
}