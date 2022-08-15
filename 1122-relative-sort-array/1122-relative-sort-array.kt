class Solution {
/*
Brute Force:
- O(n^2)

- HashMap for array 2
- Comparator
- Time O(n log(n))  Space: O(n) -- try to do in-place
*/
    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        val hm = HashMap<Int, Int>()
        for (i in arr2.indices) {
            hm[arr2[i]] = i
        }
        // Three cases
        // a and b are not in the map, sort normally
        // a is not in the map, return -1
        // b is not in the map, return 1
        // a and b are equal, return 0
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