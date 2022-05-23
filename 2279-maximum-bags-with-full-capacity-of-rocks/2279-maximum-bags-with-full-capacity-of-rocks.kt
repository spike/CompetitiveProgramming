class Solution {
    fun maximumBags(capacity: IntArray, rocks: IntArray, additionalRocks: Int): Int {
        val lst: MutableList<Int> = ArrayList()
        var moreRocks = additionalRocks
        for (i in capacity.indices) {
            if (capacity[i] >= rocks[i]) {
                lst.add(capacity[i] - rocks[i])
            }
        }
        lst.sort();
        var count = 0
        var i = 0
        while (i < lst.size && moreRocks > 0) {
            if (lst.get(i) <= moreRocks) {
                moreRocks -= lst.get(i)
                count++
            }
            i++
        }
        return count
    }
}