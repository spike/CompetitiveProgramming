class Solution {
    fun averageValue(nums: IntArray): Int {
        var sum = 0
        var items = 0
        for (n in nums) {
            if (n != 0 && n%2 == 0 && n%3 ==0) {
                sum += n
                items++
            }
        }
        if (items == 0) return 0
        else return sum / items
    }
}