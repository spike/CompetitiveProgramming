class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        val lst = ArrayList<String>()
        if (nums.size == 0) return lst
        var start = nums[0]
        for (i in 1..nums.lastIndex) {
            if (nums[i] != nums[i-1]+1) {
                if (start == nums[i-1]) {
                    lst.add("$start")
                } else {
                    lst.add("$start->${nums[i-1]}")
                }
                start = nums[i]
            }
        }
        if (start == nums[nums.lastIndex]) {
            lst.add("$start")
        } else {
            lst.add("$start->${nums[nums.lastIndex]}")
        }
        return lst
    }
}