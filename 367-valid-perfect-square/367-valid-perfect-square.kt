class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        var l = 1L  // forgot to capitalize L
        var r: Long = num.toLong()
        while(l <= r) { // consider edge case 1
            var m: Long = l + (r-l)/2
            if (m*m == num.toLong()) {
                return true;
            } else if (m*m < num) {
                l = m + 1
            } else {
                r = m - 1 
            }
        }
        return false;
    }
    // there was an overflow with num = 2147483647
}