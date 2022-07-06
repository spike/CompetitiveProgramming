class Solution {
    fun findMaxLength(nums: IntArray): Int { 
        val hm = HashMap<Int, Int>()
        var altitude = 0
        hm.put(0, -1)
        var max = 0
        for (i in nums.indices) {
            if (nums[i] == 1) {
                altitude++
            } else {
                altitude--
            }
            if (!hm.containsKey(altitude)) {
                hm.put(altitude, i)
            } else {
                val gap = i - hm.get(altitude)!!
                max = Math.max(max, gap)
            }
        }
        return max
    }
}