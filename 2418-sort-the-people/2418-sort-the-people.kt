class Solution {
    // ["Mary","John","Emma"], heights = [180,165,170]
    //
    
    // names = ["Alice","Bob","Bob"], heights = [155,185,150]
    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
        val hm = HashMap<Int, String>()
        for (i in heights.indices) {
            hm[heights[i]] = names[i] 
        }
        heights.sortDescending()
        for (i in heights.indices) {
            val h = heights[i]
            names[i] = hm[h]!! 
        }
        return names
    }
}