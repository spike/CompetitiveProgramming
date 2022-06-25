class Solution {
    fun maximumXOR(nums: IntArray): Int {
        return nums.fold(0) { mul, item -> mul or item }
    }
}