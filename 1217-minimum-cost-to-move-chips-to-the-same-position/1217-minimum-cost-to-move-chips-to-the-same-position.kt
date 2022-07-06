class Solution { 
    fun minCostToMoveChips(p: IntArray): Int {
        var even = 0
        var odd = 0
        for (i in p) {
            if (i%2 == 0) even++
            else odd++
        }
        return Math.min(even, odd)
    }
}