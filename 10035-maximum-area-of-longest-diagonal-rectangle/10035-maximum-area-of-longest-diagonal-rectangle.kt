class Solution {
    fun areaOfMaxDiagonal(d: Array<IntArray>): Int {
        val diags = Array(d.size) {0}
        var m = 0
        var maxIndex = 0
        var maxArea = 0
        for (i in d.indices) {
            diags[i] = d[i][0]*d[i][0] + d[i][1]*d[i][1]
            if (m < diags[i]) {
                m = diags[i]
                maxIndex = i
            }
        }
        val lst = ArrayList<Int>()
        for (i in d.indices) {
            if (diags[maxIndex] == diags[i]) {
                lst.add(i)
            }
        }
        
        for(j in lst) {
            val area = (d[j][0]*d[j][1])
            maxArea = maxOf(area, maxArea)
        }
        return maxArea
    }
}