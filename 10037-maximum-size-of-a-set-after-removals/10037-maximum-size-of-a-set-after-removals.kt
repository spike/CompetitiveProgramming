class Solution {
    fun maximumSetSize(nums1: IntArray, nums2: IntArray): Int {
        val a = nums1.toSet()
        val b = nums2.toSet()
        val aRemain = a - b 
        val bRemain = b - a
        val c = a.union(b)
        var dups = (a.intersect(b)).size
        
        val maxSize = nums1.size/2
        var aSize = 0
        var bSize = 0
        if (aRemain.size < maxSize) {
            var diff = maxSize - aRemain.size
            aSize = aRemain.size
            while (diff > 0  && dups > 0) {
                diff -= 1
                dups -= 1
                aSize += 1
            }
        } else {
            aSize = maxSize
        }
        if (bRemain.size < maxSize) {
            var diff = maxSize - bRemain.size
            bSize = bRemain.size
            while (diff > 0  && dups > 0) {
                diff -= 1
                dups -= 1
                bSize += 1
            }
        } else {
            bSize = maxSize
        }
        
        
        return aSize + bSize
    }
}