class Solution {
    // you need treat n as an unsigned value
    fun hammingWeight(n:Int):Int {
        var num = n
        var count = 0
        while (num != 0) { // can't be less than 0 because unsigned
            if ((num and 1) == 1) {
                count++
            }
            num = num ushr 1    
        }
        return count
    }
}