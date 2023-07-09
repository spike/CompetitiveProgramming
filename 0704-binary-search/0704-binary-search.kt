class Solution {
    fun search(arr: IntArray, target: Int): Int {
        var lo = -1
        var hi = arr.lastIndex + 1
        while (hi-lo > 1) {
            val mid = lo + (hi-lo)/2
            // mathematically equivalent to (lo + hi)/2
            // but won't overflow
            if (arr[mid] <= target) {
                lo = mid
            } else {
                hi = mid
            }
        }
        if (lo >= 0 && lo <= arr.lastIndex && 
            arr[lo] == target) 
            return lo 
        else 
            return -1 
    }
}