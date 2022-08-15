class Solution { /*
- contiguous

Brute force:
- add up all the contiguous permutations together
- exponential Big O
- keep only the maximum sum

Special case:
- if all the numbers are negative, return the least negative one


- start by adding up all the contiguous positive numbers together
- if a negative number is found after positive numbers, see if the substraction
doesn't cancel out the negative number
- keep only the maximum sum

*/  fun maxSubArray(nums: IntArray): Int {  // [-9, -2]
        var max = Integer.MIN_VALUE
        var sum = 0
        var positive = false
        for (n in nums) {  // 
            if (n >= 0) {
                sum += n
                max = Math.max(sum, max)
                positive = true
            } else {
                if ((sum + n) >= 0) {
                    sum += n
                } else {
                    if (positive) {
                        sum = 0
                        max = Math.max(0, max)
                    }
                }
            }
            max = Math.max(n, max)
        }
        return max
    }
}