class Solution {
    //[1,4,2,5,3] 
    // 1 1 1 1 1  
    // 1 1 1
    //   1 1 1
    //     1 1 1 
    // 1 1 1 1 1  
    // 3 4 5 4 3
    
    
    fun sumOddLengthSubarrays(arr: IntArray): Int {
        var total = 0
        var len = arr.size
        for (i in 0..arr.lastIndex) {
            total += ((len - i) * (i + 1) + 1)/2 * arr[i]
        }
        return total
    }
}