/*
[[10,16],[2,8],[1,6],[7,12]]
[1,6]
------
 -------
     -----    -----            */
class Solution {
    fun findMinArrowShots(points: Array<IntArray>): Int {
        points.sortBy { it[1] }
        var count = 1
        var prev = points[0][1]
        for (i in 1..points.lastIndex) {
            val p = points[i]
            if (prev >= p[0]) {
                continue
            } 
            count++
            prev = p[1]
        }            
        return count
    }
}