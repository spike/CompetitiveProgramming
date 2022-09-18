class Solution {
    fun smallestEvenMultiple(n: Int): Int {
        if (n == 1) return 2
        if (n % 2 == 0) return n
        else {
            return 2 * n
        }
    }
}