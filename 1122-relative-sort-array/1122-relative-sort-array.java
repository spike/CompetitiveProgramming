class Solution {
    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        val hm = HashMap<Int, Int>()
        for (i in arr2.indices) {
            hm[arr2[i]] = i
        }
       return arr1.sortedWith(Comparator<Int> { a, b -> 
            when {
                !hm.containsKey(a) && !hm.containsKey(b) -> a.compareTo(b)
                !hm.containsKey(b) -> -1
                !hm.containsKey(a) -> 1
                else -> hm[a]!!.compareTo(hm[b]!!)
            }
        }).toIntArray()
    }
}