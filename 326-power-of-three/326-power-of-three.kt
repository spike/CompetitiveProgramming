class Solution {
    fun isPowerOfThree(k: Int): Boolean {
        if (k < 1) return false
        var n = k
        while (n > 1) {
            if (n % 3 == 0) n /= 3
            else return false
        }
        return true
    }
}