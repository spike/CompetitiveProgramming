class Solution {
    fun isPerfectSquare(n: Int): Boolean {
        if (n == 1) return true
        var l = 0
        var r = n/2
        while(l <= r) {
            var m = l + (r-l)/2
            if (m != 0 && m == n/m && n % m == 0) {
                return true
            } else if (m != 0 && m < n/m) {
                l = m + 1
            } else {
                r = m - 1
            }
        }
        return false
    }
}