class Solution {
    // Time: O(n ** 2), Space: O(n) n being length of nums2
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val hm: HashMap<Int, Int> = HashMap()
        for (i in nums2.indices) {
            val n = nums2[i]
            hm[n] = -1
            var j = i + 1
            while (j < nums2.size) {
                if (nums2[j] > n) {
                    hm[n] = nums2[j]
                    break
                }
                j++
            }
        }
        val arr = IntArray(nums1.size) {0}
        for (i in nums1.indices) {
            arr[i] = hm[nums1[i]]!!
        }
        return arr
    }
}