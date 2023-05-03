class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val s1 = nums1.toSet()
        val s2 = nums2.toSet()
        val s3 = s1 - s2
        val s4 = s2 - s1
        return listOf(s3.toList(), s4.toList())
    }
}