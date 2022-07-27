class Solution {
    fun isRectangleOverlap(rec1: IntArray, rec2: IntArray): Boolean {
        return rec1[0] < rec2[2] && 
                rec1[1] < rec2[3] &&
                rec2[0] < rec1[2] &&
                rec2[1] < rec1[3]
    }
} 

/*
class Solution {
    fun isRectangleOverlap(rec1: IntArray, rec2: IntArray): Boolean {
        for (i in rec1.indices step 2) {
            val p = intArrayOf(rec1[i], rec1[i+1])
            if (isInside (p, rec2)) return true
        }
        return false
    }
    fun isInside(point: IntArray, rec: IntArray): Boolean {
        val x = point[0]
        val y = point[1]
        return (x in rec[0]+1 until rec[2] && y in rec[1]+1 until rec[3])
    }
} 
*/