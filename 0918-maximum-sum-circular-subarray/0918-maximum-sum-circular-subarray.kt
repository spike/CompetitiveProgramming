class Solution {
        fun maxSubarraySumCircular(A: IntArray): Int {
        val n = A.size
        var sum = 0
        var (max, min) = Int.MIN_VALUE to Int.MAX_VALUE
        var (maxSoFar, minSoFar) = 0 to 0
        for (x in A) {
            sum += x
            maxSoFar += x
            minSoFar += x
            max = maxOf(max, maxSoFar)
            min = minOf(min, minSoFar)
            if (maxSoFar < 0)
                maxSoFar = 0
            if (minSoFar > 0)
                minSoFar = 0
        }
        if (min == sum)
            return max
        return maxOf(max, sum - min)
    }
}


// class Solution {
//     fun maxSubarraySumCircular(numbers: IntArray): Int {
//         val nums = ArrayDeque<Int>()
//         for (i in nums.indices) {
//             nums.addLast(numbers[i]!!)
//         }
//         var max = Integer.MIN_VALUE
//         for (j in 1..numbers.lastIndex) {
//             max = maxOf(nums.get(0), max)
//             for (i in 1..nums.lastIndex) {
//                 nums.set(i, maxOf(nums.get(i) + nums.get(i-1),
//                                 nums.get(i)))
//                 max = maxOf(nums.get(i), max)
//             }
//             nums.addFirst(nums.removeLast())
//         }
//         return max
//     }
// }