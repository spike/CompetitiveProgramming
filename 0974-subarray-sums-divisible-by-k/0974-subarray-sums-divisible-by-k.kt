
class Solution {
    fun subarraysDivByK(nums: IntArray, k: Int): Int {
        val counter = mutableMapOf(Pair(0, 1))
        var sum = 0
        var result = 0
        for (num in nums) {
            sum += num
            sum %= k
            if (sum < 0) sum = (sum + k) % k
            result += counter.getOrDefault(sum, 0)
            counter[sum] = counter.getOrDefault(sum, 0) + 1
        }
        return result
    }
}



// class Solution {
//     fun subarraysDivByK(nums: IntArray, k: Int): Int {
//         var count = 0
//         for (i in nums.indices) {
//             if (nums[i]%k == 0) count++
//             nums[i] = maxOf(nums[i] + nums[i-1], nums[i])
//             if (nums[i]%k == 0) count++
//         }
//         return count
//     }
// }