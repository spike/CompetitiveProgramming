class Solution {
        fun subsets(nums: IntArray): List<List<Int>> {
        val lst = ArrayList<List<Int>>()
        val temp = ArrayList<Int>()
        fun backtrack(i: Int) {
            if (i > nums.lastIndex) {
                lst.add(temp.toList()); return
            }
            temp.add(nums[i]); backtrack(i+1)
            temp.removeAt(temp.lastIndex); backtrack(i+1)
        }
        backtrack(0)
        return lst
    }
}
    