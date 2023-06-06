class Solution {
    fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
        var v = 0; var h = 0; var d = 0; var p = 0
        val lst = ArrayList<Pair<Int,Int>>()
        for (i in 1..coordinates.lastIndex) {
            v = coordinates[0][0] - coordinates[i][0]
            h = coordinates[0][1] - coordinates[i][1]
            d = gcd(v, h)
            lst.add(Pair(v/d, h/d))
        }
        for (i in 1..lst.lastIndex) {
            if ((lst[i].first != lst[i-1].first) || (lst[i].second != lst[i-1].second))
                return false
        }
        return true
    }
    fun gcd(p: Int, q: Int): Int {
        if (q == 0) return p
        return gcd(q, p%q)
    }
}